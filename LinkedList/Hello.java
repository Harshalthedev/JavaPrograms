import java.util.Arrays;
import java.util.LinkedList;

public class Hello {

    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(6);
        list1.add(9);
        list1.add(15);
        list1.add(18);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);

        Node dummy = new Node(0);
        Node tail = dummy;
        
    }
}
