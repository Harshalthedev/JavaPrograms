import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetArr62 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new  int[] {2,1,5}, 806));
        System.out.println(addToArrayForm(new  int[] {1,2,0,0}, 54));
        System.out.println(addToArrayForm(new  int[] {2,7,4}, 181));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        String sum = "";
        for (int n : num) {
            sum += n;
        }
        int  sum1 = Integer.parseInt(sum);
        // System.out.println(sum1);
        sum1 += k;
        // System.out.println(sum1);
        int len = sum.length();
        List<Integer> list = new ArrayList<>();
        for ( int i = 0; i < len; i++) {
            list.add(i,sum1%10);
            sum1 /=10;
        }
        // System.out.println(list);
        Collections.reverse(list);
        // System.out.println("reverse "+list);
        return list;
    }
}
