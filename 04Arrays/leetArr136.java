import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetArr136 {
    public static void main(String[] args) {
        System.out.println(minimumSumSubarray(new ArrayList<>(Arrays.asList(3, -2, 1, 4)), 2,3));
        System.out.println(minimumSumSubarray(new ArrayList<>(Arrays.asList(-2, 2, -3, 1)), 2,3));
        System.out.println(minimumSumSubarray(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), 2,4));
    }
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0; 
            for (int j = i; j < nums.size(); j++) {
                sum += nums.get(j);
                int len = j-i+1;
                if (len >= l && len <= r && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }    
        }
        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}
