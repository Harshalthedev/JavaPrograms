import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

class LavalOrder {
    private class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }

    private Queue<Node> queue = new LinkedList<>();
    private Node root;
    
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
    public int display(int num) {
        if (root == null)   return -1;
        queue.offer(root);
        return display(root, num);
    }
    
    //BFS
    private int display(Node node, int num) {
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node curNode = queue.poll();
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
                if ( num == curNode.val) {
                    num = queue.poll().val;
                }
            }
        }
        return num;
    }
}