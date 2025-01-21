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
    private List<List<Integer>> list = new ArrayList<>();
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
    public List<List<Integer>> display() {
        if (root == null)   return list;
        queue.offer(root);
        return display(root);
    }
    
    //BFS
    private List<List<Integer>> display(Node node) {
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> curList = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                Node curNode = queue.poll();
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
                curList.add(curNode.val);
            }
            list.add(curList);
        }
        return list;
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