public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;
    
    int first = 0;
    int end = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public void enque(int item) throws CircularException {
        if (isFUll()) {
            throw new CircularException("Queue is full");
        }
        size++;
        data[end++] = item;
        end = end % data.length;
    }


    public int deque() throws CircularException {
        if (isEmpty()) {
            throw new CircularException("Queue is Empty");
        }
        int removed = data[first++];
        first = first % data.length; 
        size--;
        return removed;
    }

    public void display() {
        int i = first;
        int count = 0;
        while (count < size) {
            System.out.print(data[i++]+" ");
            i = i % data.length;
            count++;
        }
        System.out.println("End");
    }


    public int peek() throws CircularException {
        if (isEmpty()) {
            throw new CircularException("Cannot peek from empty Stack");
        }
        return data[first];
    }
    public boolean isFUll() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
