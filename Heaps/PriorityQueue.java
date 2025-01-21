
public class PriorityQueue {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    private Node head = null;
    
    
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null || val <= head.val) {
            node.next = head;
            head = node;
        }
        else {
            Node temp = head;
            while ( temp.next != null && temp.next.val <= val) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void print() throws Exception{
        if (head== null) {
            throw new Exception("Emptyt queue");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public int poll() throws Exception{
        if ( head == null) {
            throw new Exception("Queue is empty");
        }
        int highestValue = head.val;
        head = head.next;
        return highestValue;
    }

    public int peek() throws Exception{
        if ( head == null) {
            throw new Exception("Queue is empty");
        }
        int peek = head.val;
        return peek;
    }
}
