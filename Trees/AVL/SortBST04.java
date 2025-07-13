public class SortBST04 {
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
    public SortBST04() {

    }
    private Node root;
    public void insertfun(int[] arr) {
        insertfun(arr , 0 , arr.length-1);
    }
    private void insertfun(int[] arr , int l , int r) {
        if ( l > r) {
            return;
        }
        int mid = l+(r-l)/2;
        this.insert(arr[mid]);
        insertfun(arr, l ,mid-1);
        insertfun(arr, mid+1 ,r);
    }
    // root 
    public void insert(int value){
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
