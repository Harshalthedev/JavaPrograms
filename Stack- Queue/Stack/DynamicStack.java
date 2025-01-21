public class DynamicStack extends CustumStack {
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }
    @Override
    public void push(int item) throws StackException {
        if (this.isFUll()) {
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }
}
