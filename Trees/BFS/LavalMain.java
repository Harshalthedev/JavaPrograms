import java.util.*;
public class LavalMain {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        LavalOrder lo = new LavalOrder();
        lo.insert(arr);
        lo.displaytree();
        List<List<Integer>> list = lo.display();
        System.out.println(list);
    }
}