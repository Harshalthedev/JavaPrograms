import java.util.ArrayList;

public class hello {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);
        int first = 3;
        int second = 1;
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second,temp );
        System.out.println(list);
    }
}