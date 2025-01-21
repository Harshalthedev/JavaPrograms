public class Circular {
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    private Node Head;
    private Node temp;

    public Circular() {
        this.Head = null;
        this.temp = null;
    }

    public void insert(int val) {
        insertEnd(val);
    }
    //insertion at end
    private void insertEnd(int val) {
        Node node = new Node(val);
        if ( Head == null) {
            Head = node;
            Head.next = null;
            temp = Head;
            return;
        }
        temp.next = node;
        node.next = Head;
        temp = node;
    }

    //display
    public void display() {
        displayCLL();
    }
    private void displayCLL(){
        if ( Head == null) {
            System.out.println("CLL empty");
            return;
        }
        temp = Head;
        do {
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }while(temp != Head);
    }

    public void deletionVALUE(int n) {
        deletion(n);
    }
    //deletionn
    private void deletion(int n) {
        if (Head == null) {
            System.out.println("CLL empty");
            return;
        }
        if (Head.val == n) {
            if (Head.next == null) {
                Head = null;
                System.out.println("deleted the only node");
                return;
            }
            Head = Head.next;
            temp.next = Head;
        }
        temp = Head;
        do {
            if (n == temp.next.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }while(temp != Head);
    }
}
