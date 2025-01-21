class AVLtree {
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
    private Node root;

    //height
    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if ( node == null) {
            return -1;
        }
        return node.height;
    }

    //empty
    public boolean isEmpty() {
        return root==null;
    }

    //balanced
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if ( node == null ) {
            return true;
        } 
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // array element insertion
    public void push ( int[] arr) {
        for (int i : arr) {
            root = push(root , i);
        }
    }
    
    // root
    // private void push( int value) {
    //     root = push(root , value); 
    // }
    // insertion
        private Node push ( Node node , int value) {
            if ( node == null) {
                node = new Node(value);
                return node;
            }
            if ( value > node.value) {
                node.right = push(node.right, value);
            }
            if ( value < node.value) {
                node.left = push(node.left, value);
            }

            node.height = Math.max(height(node.left), height(node.right))+1;

            return rotate(node);
        }

        //subtree roatation
        private Node rotate(Node node) {
            if ( height(node.left) - height(node.right) > 1) {
                //left heavy
                //  case 1 : left - left case
                if ( height(node.left.left) - height(node.left.right) > 0 ) {
                    return rightRotate(node);
                }
                //  case 2 : left - right case
                if ( height(node.left.left) - height(node.left.right) < 0 ) {
                    node.left = leftRotate(node);
                    return rightRotate(node);
                }
            }
            if ( height(node.left) - height(node.right) < -1) {
                //right heavy
                //  case 1 : right - right case
                if (height(node.right.right) - height(node.right.left) > 0) {
                    return leftRotate(node);
                }            
                //  case 2 : right - left case
                if ( height(node.right.right) - height(node.right.left) < 0 ) {
                    node.right = rightRotate(node);
                    return leftRotate(node);
                }
            }
            return node;
        }

        private Node leftRotate(Node p) {
            Node c = p.right;
            Node t = c.left;
            c.left = p; 
            p.right = t;
            p.height = Math.max(height(p.left),height(p.right))+1;
            c.height = Math.max(height(c.left),height(c.right))+1;
            return c;
        }
        private Node rightRotate(Node p) {
            Node c = p.left;
            Node t = c.right;
            c.right = p;
            p.left = t;
            p.height = Math.max(height(p.left),height(p.right))+1;
            c.height = Math.max(height(c.left),height(c.right))+1;
            return c;
        }


    //display
    public void displayNode() {
        displayNode(root,"");
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
