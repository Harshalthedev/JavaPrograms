public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    public void insert(int data,Node next) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data , Node next) {
            this.data = data;
            this.next= next;
        }
    }
}
