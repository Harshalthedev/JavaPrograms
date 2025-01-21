public class SingleREC {
    private class Node {
        int data;
        Node next;
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        Node(int data) {
            this.data = data;
        }
    }

    private Node Head;
    private Node temp;
    SingleREC() {
        this.Head = null;
    }

    public void insert(int val) {
        insertEnd(val);
    }
    private void insertEnd(int data) {    
        if ( Head == null) {
            Node node = new Node(data);
            Head = node;
            temp = Head;
            return;
        }
        Node node = new Node(data);
        temp.next = node;
        temp = node;
    } 

    //using recursion
    public void insertRec(int index, int val) {
        Head = insertRec(index, val, Head );
    }
    private Node insertRec(int index, int val, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);
            return newNode;
        }
        node.next = insertRec(index-1, val, node.next);
        return node;
    }
    public void display() {
        display(Head);
    }
    private void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
