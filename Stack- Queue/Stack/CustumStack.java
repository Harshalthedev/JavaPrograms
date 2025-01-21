public class CustumStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;
    int ptr = -1;

    public CustumStack() {
        this(DEFAULT_SIZE);
    }
    public CustumStack(int size) {
        this.data = new int[size];
    }

    public void push(int item) throws StackException {
        if (isFUll()) {
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = item;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from empty Stack");
        }
        return data[ptr];
    }
    public boolean isFUll() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}