import java.util.ArrayList;

public class HeapMain {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(5);
        heap.insert(8);
        heap.insert(3);
        heap.insert(4);
        heap.insert(6);
        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
        // System.out.println(heap.remove());
        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
