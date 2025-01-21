import java.util.Arrays;
import java.util.HashMap;

public class Program07 {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        int n =arr.length;
        int[] copy = new int[n];

        for (int i = 0 ;i < n ; i++ ) {
            copy[i] = arr[i];
        }
        Arrays.sort(copy);    //10,10,20,25,30
     
        HashMap<Integer , Integer > map = new HashMap<>();
        int rnk = 1;
        for (int i : copy) {
            if ( map.containsKey(i)) {
                map.put(i, map.get(i) );
            }
            else {
                map.put(i, rnk);
                rnk++;
            }
        }
        for (int i = 0; i < n; i++) {
            copy[i] = map.get(arr[i]);
        }
        for (int i : copy) {
            System.out.print(i+" ");
        }
    }
}
