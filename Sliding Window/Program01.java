public class Program01 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int l = 0;
        int r = 0;
        int zeros = 0;
        int maxLen = 0;
        while ( r < nums.length) {
            if ( nums[r] == 0 ) {
                zeros++;
            }
            if ( zeros > k) {
                if ( nums[l] == 0) zeros--;
                l++;
            }
            if ( zeros <= k) {
                maxLen = Math.max(maxLen, r - l +1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}