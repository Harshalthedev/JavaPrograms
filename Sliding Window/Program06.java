import java.util.*;
public class Program06 {
    public static void main(String[] args) {
        int[] arr = {2,7,6,1,4,5};
        int k = 3;

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        int sum = 0;
        int maxLen = -1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if ( !map.containsKey(sum % k ) ) map.put(sum % k , i);
            
            else  maxLen = Math.max(maxLen,  i - (map.get(sum % k )) ); 
            
        }

        System.out.println(maxLen);
    }
}
