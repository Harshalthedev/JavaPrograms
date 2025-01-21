import java.util.LinkedList;
import java.util.Queue;

final class OrderSucc {
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

    public Integer getSuccessor(int num) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node curNode = queue.poll();
                // System.out.println(curNode.val);
                // Add children to the queue for BFS
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                    // System.out.println(curNode.left.val);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                    // System.out.println(curNode.right.val);
                }
                if (curNode.val == num) {
                    return queue.peek().val;
                }
            }
        }
        // If we finish the traversal and didn't find the successor
        return null;
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
