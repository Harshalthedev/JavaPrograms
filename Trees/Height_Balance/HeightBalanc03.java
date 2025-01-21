class Height03 {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
        public int get() {
            return value;
        }
    }
    private Node rootnode;
    public int height() {
        return height(rootnode);
    }
    private int height(Node node) {
        if ( node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return rootnode==null;
    }
    public boolean balanced() {
        return balanced(rootnode);
    }
    private boolean balanced(Node node) {
        if ( node == null ) {
            return true;
        } 
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    


    private void push( int value) {
        rootnode = push(rootnode , value); 
    }
    private Node push ( Node node , int value) {
        if ( node == null) {
            node = new Node(value);
            return node;
        }
        if ( value > node.value) {
            node.right = push(node.right, value);
        }
        if ( value <= node.value) {
            node.left = push(node.left, value);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;

        return node;
    }
    public void push ( int[] arr) {
        for (int i : arr) {
            push(i);
        }
    }


    // display
    public void displayNode() {
        displayNode(rootnode,"");
    }
    private void displayNode(Node node,String indent) {
        if ( node == null) {
            return;
        }
        System.out.println(indent+node.get());
        displayNode(node.right,indent+"\t");
        displayNode(node.left,indent+"\t");
    }
}
