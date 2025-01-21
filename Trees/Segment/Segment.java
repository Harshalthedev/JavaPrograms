public class Segment {
    public static void main(String[] args) {
        // int[] arr = {2, 5 , 6,-8 ,-2 ,5};
        int[] arr = {3, 8, 7, 6, -2, -8, 4, 9};
        construct(arr);
        display(root,"");
    }

    static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node right;
        Node left;
        Node ( int startInterval , int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    static Node root;

    public static void construct(int[] arr) {
        root = construct(arr,0,arr.length-1);
    }

    public static Node construct(int[] arr, int s, int e) {
        if ( s == e) {
            Node leaf = new Node(s, e);
            leaf.data = arr[s];
            return leaf;
        }

        int mid = s+(e-s)/2;
        Node node = new Node(s, e);
        node.left = construct(arr, s, mid);
        node.right = construct(arr, mid+1, e);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public static void display(Node node, String indent) {
        if ( node == null) {
            return;
        }
        System.out.println(indent+node.data);
        display(node.right, indent+"\t");
        display(node.left, indent+"\t");
    }

}
