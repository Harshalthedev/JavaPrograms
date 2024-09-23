
class prog01 {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }                                               //stack implemention using linkedlist
    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if ( isEmpty() ) {
                head = newNode;
                return; 
            }
            newNode.next = head;
            head = newNode;
        }
        public static int peek(){
            return head.data ;
        }
        public static void pop() {
            // int top = head.data;
            head = head.next;
            // return top;
        }
        
    } 
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}