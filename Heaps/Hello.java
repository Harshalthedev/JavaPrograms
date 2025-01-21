import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        heap heap = new heap();
        heap.insert(25);
        heap.insert(5);
        heap.insert(8);
        heap.insert(3);
        heap.insert(4);
        heap.insert(6);
        ArrayList<Integer> list = heap.heapsort();
        System.out.println(list);
    }
}

class heap {
    private ArrayList<Integer> list;

    heap() {
        list = new ArrayList<>();
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(int val) {
        list.add(val);
        upheap(list.size() - 1);
    }

    public int remove() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int removed = list.get(0);
        int last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return removed;
    }

    public void downheap(int index) {
        int left = left(index);
        int right = right(index);
        int largest = index;

        if (left < list.size() && list.get(left) > list.get(index)) {
            largest = left;
        }
        if (right < list.size() && list.get(right) > list.get(largest)) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            downheap(largest);
        }
    }

    public void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(p) < list.get(index)) {
            swap(p, index);
            upheap(p);
        }
    }

    private void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public void maxHeap() {
        // Convert the list into a max heap by applying downheap starting from the last non-leaf node
        for (int i = list.size() / 2 - 1; i >= 0; i--) {
            downheap(i);
        }
    }

    public ArrayList<Integer> heapsort() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(this.remove());
        }
        return list;
    }
}
