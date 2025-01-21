public class CustumQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;
    int ptr = 0;

    public CustumQueue() {
        this(DEFAULT_SIZE);
    }
    public CustumQueue(int size) {
        this.data = new int[size];
    }

    public void enque(int item) throws QueueException {
        if (isFUll()) {
            throw new QueueException("Queue is full");
        }
        data[ptr++] = item;
    }
    public int deque() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is Empty");
        }
        int removed = data[0];
        for (int i = 0; i < data.length-1; i++) {
            data[i] = data[i+1];
        }
        ptr--;
        return removed;
    }
    public void display() {
        for (int i = 0; i <  ptr; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }
    public int peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Cannot peek from empty Stack");
        }
        return data[0];
    }
    public boolean isFUll() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}
