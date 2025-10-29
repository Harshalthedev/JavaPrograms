import java.util.Arrays;

public class Program04 {
    public static void main(String[] args) {
        System.out.println(maxAlternatingSum(new int[] {1,2,3}));
        System.out.println(maxAlternatingSum(new int[] {-3,-2,3,2,-1,1}));
    }
    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++ ) nums[i] = Math.abs(nums[i]);
        Arrays.sort(nums);
        int half = n/2;
        int[] small = new int[half];
        for (int i = 0; i < half; i++) {
            small[i] = nums[i];
        }
        int[] big = new int[n - half];
        int k = 0;
        for (int i = half; i < n; i++) {
            big[k++] = nums[i];
        }
        reverse(big);
        int i = 0;
        long max = 0;
        while (i < small.length && i < big.length) {
            long s = (long) (small[i] * small[i]);
            long b = (long) (big[i] * big[i]);
            max += (long) b - s;
            i++;
        }
        while (i < small.length) {
            max += (long) (small[i] * small[i]);
            i++;
        }
        while (i < big.length) {
            max += (long) (big[i] * big[i]);
            i++;
        }
        return max;
    }
    public static void reverse(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
