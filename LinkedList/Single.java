public class Single {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    Single() {

    }

    private Node head;
    private Node temp;


    //deletion at specific index
    public void deletion(int index) {
        // head empty
        if ( head == null) {
            System.out.println("head is empty");
            return;
        }
        //very first node
        if ( index == 0) {
            head = head.next;
            return;
        }

        int count = 0;
        temp = head;
        while ( temp != null && count < index-1) {
            count++;
            temp = temp.next;
        }
        //index greater than size;
        if ( temp == null || temp.next == null) {
            System.out.println("index out of bound");
            return;
        }

        // deletion of node
        temp.next = temp.next.next;;

    }


    //insert at start
    public void addbegin(int[] arr) {
        for (int i : arr) {
            insertBegin(i);
        }
    } 
    private void insertBegin(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    } 

    //insertion at specific index
    public void insertAt(int index, int data){
        if ( index < 0) {
            return;
        }
        Node node = new Node(data);
        //insert at very first node
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }
        temp = head;
        int count = 0;
        while ( temp != null && count < index-1) {
            temp = temp.next;
            count++;
        }
        if ( temp == null) return;  
        //insert in between nodes
        node.next = temp.next;
        temp.next = node;

    }

    //insert at end
    public void addend(int[] arr) {
        for (int i : arr) {
            insertEnd(i);
        }
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
    
 

    //reverse list
    public void reverse() {
        reverse(head);
    }
    private void reverse(Node node) {
        if (head == null || head.next == null) {
            display(head);
            return;
        }
        Node prevNode = null;        
        Node curNode = head;     
        Node temp;        
        while (curNode != null) {
            temp = curNode.next;   
            curNode.next = prevNode;     
            prevNode = curNode;          
            curNode = temp;          
        }
        head = prevNode;
    }

    //display
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