import java.util.*;
public class Program08 {
    public static void main(String[] args) {
        // int[] arr = {2,7,6,1,4,5};
        int[] arr = {23,2,4,6,6};
        // int[] arr = {23,2,6,4,7};
        int k = 7;

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if ( !map.containsKey(sum % k ) ) map.put(sum % k , i);
            
            else  maxLen = i - (map.get(sum % k )); 
            if ( maxLen >= 2) {
                System.out.println(true);
                return;
            }
            
        }

        System.out.println(false);
    }
}
