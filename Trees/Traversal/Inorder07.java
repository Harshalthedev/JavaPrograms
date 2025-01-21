public class Inorder07 {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
        }
        public int getvalue() {
            return value;
        }
    } 
    public Inorder07() {

    }
    private Node root;
    // root 
    private void insert(int value){
        root = root(root , value);
    }

    private Node root(Node node , int value) {
        if ( node == null ) {
            node = new Node(value);
            return node;
        }
        if ( value > node.value ) {
            node.right = root(node.right, value);
        }
        if ( value <= node.value ) {
            node.left = root(node.left, value);
        }
        return node;
    }

    public void insert(int[] arr) {
        for (int i : arr) {
            insert(i);
        }
    }
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if ( node == null) {
            return;
        }
    
        inOrder(node.left);                   // First, traverse the left subtree
        System.out.print(node.value+" ");      // Then, visit the root node
        inOrder(node.right);                // Finally, traverse the right subtree

    }
    public static void main(String[] args) {
        Inorder07 in = new Inorder07();
        in.insert(new int[] {10,20,15,13,12});
        in.inOrder();
    }
}
