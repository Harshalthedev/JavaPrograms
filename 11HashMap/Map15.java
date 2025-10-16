import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Data {
    int source;
    int destination;
    int timestamp; 

    Data (int source, int destination, int timestamp) {
        this.source = source;
        this.destination = destination;
        this.timestamp = timestamp;
    }
}
class Router {
    private Queue<Data> queue;
    private int memorySize;
    private Set<String> set;
    private Map<Integer, List<Integer>> map;
    public Router(int memoryLimit) {
        queue = new LinkedList<>();
        set = new HashSet<>();
        map = new HashMap<>();
        memorySize = memoryLimit;
    }
    public String packet(int source, int destination, int timestamp) {
        String s = source+ "#" + destination+ "#" + timestamp;
        return s;
    }
    public boolean addPacket(int source, int destination, int timestamp) {
        String s = packet(source, destination, timestamp);
        if (!set.contains(s)) return false;
            
        
        if(queue.size() == memorySize) {
            Data data = queue.poll();
            set.remove(packet(data.source, data.destination, data.timestamp));
        }
        Data data = new Data(source, destination, timestamp);
        queue.offer(data);
        set.add(s);
        
        map.computeIfAbsent(destination, x -> new ArrayList<>()).add(timestamp);
        return true;
    }
    
    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[] {};
        Data data = queue.poll();
        set.remove(packet(data.source, data.destination, data.timestamp));

        List<Integer> li = map.get(data.destination);
        li.remove(0);
        if(li.isEmpty()) map.remove(data.destination);
        return new int[] {data.source, data.destination, data.timestamp};
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        List<Integer> li = map.get(destination);
        int lo = lowerBound(li, startTime);
        int hi = upperBound(li, endTime);
    }
    public int lowerBound(List<Integer> list, int target) {
        int s = 0;
        int e = list.size();
        while (s < e) {
            int mid = s + (e-s)/2;
            if (list.get(mid) >= target) {
                e = mid;
            }
            else s = mid+1; 
        }
        return s;
    }
    public int upperBound(List<Integer> list, int target) {
        int s = 0, e = list.size();
        while (s < e) {
            int mid = s + (e -s)/2;
            if (list.get(mid) > target) e = mid;
            else s = mid+1
        }
        return s;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */