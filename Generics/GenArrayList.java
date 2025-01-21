import java.util.Arrays;

public class GenArrayList<T> {
    private int DEFALUT_SIZE = 5;
    private int size = 0;
    private Object[] arr;

    public GenArrayList() {
        arr = new Object[DEFALUT_SIZE];
    }

    public void add(T val) {
        if (isFull()) {
            reSize();
        }
        arr[size++] = val;
    }

    private void reSize() {
        Object[] temp =  new Object[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    public void set(int index, T val) {
        if ( index >= arr.length) {
            System.out.println("index out of bound");
        }
        arr[index] = val;
    }

    public T get(int index) {
        return (T)arr[index];
    }
    public void remove() {
        size--;
    }
    public boolean isFull() {
        return  size == arr.length;
    }
    @Override
    public String toString() {
            return "{ "+Arrays.toString(arr)+" }";

    }

}
