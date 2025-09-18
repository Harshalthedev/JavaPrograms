import java.util.*;

class Manager {
    int userId;
    int taskId;
    int priority;

    Manager(int userId, int taskId, int priority) {
        this.userId = userId;
        this.taskId = taskId;
        this.priority = priority;
    }
}

class TaskManager {
    private Map<Integer, Manager> taskMap;
    private TreeSet<Manager> set;

    public TaskManager(List<List<Integer>> tasks) {
        set = new TreeSet<>((a, b) -> {
            if (a.priority != b.priority) {
                return Integer.compare(b.priority, a.priority); // Descending priority
            }
            return Integer.compare(b.taskId, a.taskId); // Descending taskId
        });
        taskMap = new HashMap<>();

        for (List<Integer> list : tasks) {
            int userId = list.get(0);
            int taskId = list.get(1);
            int priority = list.get(2);
            Manager manager = new Manager(userId, taskId, priority);
            set.add(manager);
            taskMap.put(taskId, manager); 
        }
    }

    public void add(int userId, int taskId, int priority) {
        Manager manager = new Manager(userId, taskId, priority);
        taskMap.put(taskId, manager);
        set.add(manager);
    }

    public void edit(int taskId, int newPriority) {
        if (!taskMap.containsKey(taskId)) {
            return;
        }
        Manager manager = taskMap.get(taskId);
        set.remove(manager); // Must remove first to re-sort
        manager.priority = newPriority;
        set.add(manager); // Add with new priority for correct sorting
    }

    public void rmv(int taskId) {
        if (!taskMap.containsKey(taskId)) {
            return;
        }
        Manager manager = taskMap.get(taskId);
        set.remove(manager);
        taskMap.remove(taskId);
    }

    public int execTop() {
        if (set.isEmpty()) {
            return -1;
        }
        Manager topTask = set.first();
        set.remove(topTask);
        taskMap.remove(topTask.taskId);
        return topTask.userId;
    }
}

class Map14 {
    public static void main(String[] args) {
        System.out.println("Initializing TaskManager...");
        
        // Initial tasks: [userId, taskId, priority]
        List<List<Integer>> initialTasks = Arrays.asList(
            Arrays.asList(101, 1001, 3),
            Arrays.asList(102, 1002, 5),
            Arrays.asList(103, 1003, 5),
            Arrays.asList(104, 1004, 1)
        );

        TaskManager taskManager = new TaskManager(initialTasks);
        System.out.println("Initial tasks loaded.\n");

        System.out.println("--- Executing initial top task ---");
        int userId1 = taskManager.execTop();
        System.out.println("User ID of executed task: " + userId1 + "\n");
        
        System.out.println("--- Adding a new task ---");
        // This task (priority 6) will become the new top task.
        taskManager.add(105, 1005, 6);
        System.out.println("--- Executing the new top task ---");
        int userId2 = taskManager.execTop();
        System.out.println("User ID of executed task: " + userId2 + "\n");
        
        System.out.println("--- Editing a task's priority ---");
        // Edit task 1004's priority to 8, making it the highest.
        taskManager.edit(1004, 8);
        System.out.println("--- Executing the edited top task ---");
        int userId3 = taskManager.execTop();
        System.out.println("User ID of executed task: " + userId3 + "\n");

        System.out.println("--- Removing a task ---");
        // Remove task 1001.
        taskManager.rmv(1001);
        System.out.println("--- Executing next top task after removal ---");
        int userId4 = taskManager.execTop();
        System.out.println("User ID of executed task: " + userId4 + "\n");
        
        System.out.println("--- Attempting to execute when empty ---");
        taskManager.execTop();
        taskManager.execTop();
    }
}