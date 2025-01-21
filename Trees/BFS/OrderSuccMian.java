import java.util.List;

public class OrderSuccMian {
    public static void main(String[] args) {
        // int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] arr = {1,2,3,4,5,6,7,8,9};
        OrderSucc lo = new OrderSucc();
        lo.insert(arr);
        // lo.displaytree();
        lo.displaytree();
        System.out.println(lo.getSuccessor(4));
    }
}
