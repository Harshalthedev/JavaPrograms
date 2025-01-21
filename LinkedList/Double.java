public class Double {
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6};
    //     insert(arr);
    // }
    static class Node {
        int data;
        Node prevNode;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }

    private Node head;
    int size = 0;
    public void insert(int[] arr){
        for (int i : arr) {
            insert(i);
        }
    }

    private void insert(int data) {
        if ( head == null ) {
            Node node = new Node(data);
            node.next = null;
            node.prevNode = null;
            head = node;
            size++;            
        }
        else if(head != null) {
            Node NewNode = new Node(data);
            NewNode.prevNode = null;
            head.prevNode = NewNode;
            NewNode.next = head;
            head = NewNode;
            size++;
        }
    }
    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void revdisplay() {
        Node temp = head;
        while (temp!= null && temp.next != null) {
            temp = temp.next;
        }
        // head = temp;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.prevNode;
        }
    }
}
