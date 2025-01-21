import java.util.Arrays;
import java.util.HashMap;

public class Program110 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,9,4};
        // int[] arr = {3,4};
        // int[] arr = {1,1,2,3};

        int len = arr.length;
        int TeamSum = Arrays.stream(arr).sum();
        if ( TeamSum % (len/2) != 0) {
            System.out.println(-1);
            return;
        }

        int targetSum = TeamSum / (len/2);
        HashMap<Integer ,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        } 

        long chemistry = 0;
        for (int i : arr) {
            if ( map.containsKey(i) && map.get(i) > 0) {
                map.put(i, map.get(i)-1);
                int y = targetSum - i;
                if (map.containsKey(y) && map.get(y) > 0) {
                    map.put(y, map.get(y)-1);
                    chemistry += i * y;
                }
                else {
                    System.out.println(-1); 
                    return;
                }
            }
        }
        System.out.println(chemistry);
    }
}
