import java.util.HashSet;
import java.util.Set;

public class leetArr139 {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {1,2,3,4,5}));
        System.out.println(maxSum(new int[] {1,1,0,1,1}));
        System.out.println(maxSum(new int[] {1,2,-1,-2,1,0,-1}));
    }
    public static int maxSum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for (int j = i; j < n; j++){
                if (set.contains(nums[j])) {
                    break;
                }
                set.add(nums[j]);
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        } 
        return maxSum;
    }
}
