import java.util.*;
public class LavalSum {

    private class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    private Node root;
    public void insert(int[] arr) {
        root = insert(arr, 0, arr.length - 1);
    }

    private Node insert(int[] arr, int l, int h) {
        if (l > h) {
            return null;
        }
        int mid = l + (h - l) / 2;
        Node node = new Node(arr[mid]);
        node.left = insert(arr, l, mid - 1);
        node.right = insert(arr, mid + 1, h);
        return node;
    }
    public void insert(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the number in the left of " + node.val + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of this node " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the number in the right of " + node.val + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of this node " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public int maxLevelSum() {
        return maxLevelSum(root);
    }
    private int maxLevelSum(Node root) {
        Queue<Node> queue = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        queue.offer(root);
        // int max = Integer.MIN_VALUE;
        int lvl = 0;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int sum = 0;
            lvl++;
            for ( int i = 0; i < levelSize; i++) {
                Node curNode = queue.poll();
                sum += curNode.val;
                if ( curNode.left != null){
                    queue.offer(curNode.left);
                }
                if ( curNode.right != null){
                    queue.offer(curNode.right);
                }
            }
            map.put(lvl, sum);
            // max = Math.max(max, sum);
        }
        int maxlevel = 0;
        for (int key : map.keySet()) {
            if ( map.get(key) > maxlevel) maxlevel = key;
        }
        return maxlevel;
    }
    public void displaytree() {
        display(root, "");
    }
    private void display(Node node,String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
}
