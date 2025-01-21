public class DynamicArray {
    private int[] arr;
    private int DEFALUT_SIZE = 5;
    private int size = 0;

    public DynamicArray() {
        this.arr = new int[DEFALUT_SIZE];
    }

    public void add(int val) {
        if ( isFull()) {
            resize();
        }
        arr[size++]  = val;
    }
    private boolean isFull() {
        return size == arr.length;
    }
    private void resize() {
        if ( size == arr.length-1) {
            int[] temp = new int[size*2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }
    public int get(int index) throws ArrayException {
        if ( index >= size) {
            throw new ArrayException("Index out of bound for length "+size);
        }
        return arr[index];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}