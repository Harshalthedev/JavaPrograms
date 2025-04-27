import java.util.Arrays;

public class Prog02 {
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        long prod = 1;
        int cnt = 0;
        int l = 0, r = 0;
        int n = nums.length;
        Arrays.sort(nums);
        while ( l <= r && r < n) {
            if ( (long) prod*nums[r] <= k){
                prod *= nums[r];
                r++;
            }
            else if (prod*nums[r] > k){
                cnt += r-l+1;
                prod /= nums[l];
                l++;
                r--;
            }
        }
        return cnt;
    }
}
