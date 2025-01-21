import java.util.ArrayList;
public class RemoveDub {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node temp;

    // public void removedub(ArrayList<Integer> list) {
    public void removedub() {
        // removedubs(list);
        removedubs();
    }
    // private void removedubs(ArrayList<Integer> list) {
    private void removedubs() {
        Node node = head;
        while (node.next != null) {
            if ( node.next != null && node.data == node.next.data) {   
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
    }

    //insert at end
    public void insert(int data) {
        insertEnd(data);
    }
    private void insertEnd(int data) {
        if ( head == null){
            Node node = new Node(data);
            head = node;
            temp = head;
        }
        else {
            Node node = new Node(data);
            temp.next = node;
            node.next = null;
            temp = temp.next;
        }
    }
    public void display() {
        display(head);
    }
    private void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
