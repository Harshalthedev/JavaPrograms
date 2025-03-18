public class leetArr72 {
    public static void main(String[] args) {
        System.out.println(longestNiceSubarray(new int[] {1,3,8,48,10}));
    }
    public static int longestNiceSubarray(int[] nums) {
        int len = 0;
        int j = 0;
        int bitmask = 0;
        for ( int i = 0; i < nums.length; i++) {
            while ( (bitmask & nums[i]) != 0) {
                bitmask ^= nums[j];
                j++;
            } 
            bitmask |= nums[i];
            len = Math.max(len , i-j+1);
        } 
        return len;
    }
}
