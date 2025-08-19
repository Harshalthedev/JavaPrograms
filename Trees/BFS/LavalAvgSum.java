import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class LavalAvgSum {
    private class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    private Queue<Node> queue = new LinkedList<>();
    private List<Double> list = new ArrayList<>();
    private Node root;
    // private int val;
    
    public void insert(int[] arr) {
        root = insert(arr, 0, arr.length-1);
    }
    private Node insert(int[] arr, int l, int h) {
        if ( l > h) {
            return null;
        }
        int mid = l+(h-l)/2;
        Node node = new Node(arr[mid]);
        node.left = insert(arr, l, mid-1);
        node.right = insert(arr, mid+1, h);
        return node;
    }
    public List<Double> display() {
        if (root == null)   return list;
        queue.offer(root);
        return display(root);
    }


    public int deepestLeavesSum(Node root) {
        //bfs
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
                sum += curNode.val;
            }
            list.add(sum);
        }
        return list.get(list.size()-1);
    }
    
    //BFS
    private List<Double> display(Node node) {
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double avgSum = 0;
            for (int i = 0; i < levelSize; i++) {
                Node curNode = queue.poll();
                avgSum += curNode.val;
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            avgSum /= levelSize;
            list.add(avgSum);
        }
        return list;
    }
}