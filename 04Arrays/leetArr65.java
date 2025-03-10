import java.util.Arrays;

public class leetArr65 {
    public static void main(String[] args) {
        productExceptSelf(new int[] {1,2,3,4});
    }
    public static void productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        System.out.println(suffix.length);
        prefix[0] = 1;
        suffix[n] = 1;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        for ( int i = suffix.length-2; i>= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i];
        }
        System.out.println(Arrays.toString(suffix));
    }
}
