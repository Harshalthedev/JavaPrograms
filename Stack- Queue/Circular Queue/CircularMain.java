public class CircularMain {
    public static void main(String[] args) throws Exception{
        CircularQueue cqueue = new CircularQueue();

        cqueue.enque(36);
        cqueue.enque(74);
        cqueue.enque(69);
        cqueue.enque(25);
        cqueue.enque(12);

        cqueue.display();
        System.out.println();
    }
}
