import java.util.Arrays;

public class leetArr141 {
    public static void main(String[] args) {
        System.out.println(maximumMedianSum(new int[] {2,1,3,2,1,3}));
    }
    public static long maximumMedianSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        long median = 0;
        while ( l < r-1) {
            median += (long) nums[r-1];
            r -= 2;
            l++;
        }
        return median;
    }
}
