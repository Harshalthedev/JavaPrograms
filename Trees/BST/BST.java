public class BST {    
    
    public static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }

    static Node root;

    public static void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
          rootInitialize(nums[i]);
        }
    }
    static void rootInitialize(int value) {
        root = bst(root , value);   
    }
    static Node bst(Node node, int value) {

        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (node.value > value) {
            node.right = bst(node.right, value);
        }
        if (node.value < value) {
            node.left = bst(node.left, value);
        }
        return node;
    }
    
    static void displayBst ( Node node , String indent ) {
        if ( node == null ) {
            return;
        }
        System.out.println(indent + node.value);
        displayBst(node.left, indent + "\t");
        displayBst(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        // int[] nums = { 15,13,20,8,17,14,22,3,26,11,29 };
        int[] nums = { 1,2,3,4,5,6,7,8,9};
        populate(nums);
        displayBst(root , "");
    }
}
