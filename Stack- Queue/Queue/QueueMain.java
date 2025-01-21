public class QueueMain {
    public static void main(String[] args) throws QueueException{
        CustumQueue queue = new CustumQueue();
        queue.enque(25);
        queue.enque(85);
        queue.enque(15);
        queue.enque(5);
        // queue.enque(2);
        
        queue.display();
        System.out.println();

        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println();

        System.out.println(queue.peek());
    }
}
