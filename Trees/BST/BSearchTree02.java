public class BSearchTree02 {
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
    public BSearchTree02() {

    }
    private Node root;
    // root 
    public void mainNode (int value){
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

    public void insertfun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            mainNode(arr[i]);
        }
    }
    public void displayNode() {
        displayNode(root,"");
    }
    private void displayNode(Node node,String indent) {
        if ( node == null) {
            return;
        }
        System.out.println(indent+node.value);
        displayNode(node.right,indent+"\t");
        displayNode(node.left,indent+"\t");
    }
}
