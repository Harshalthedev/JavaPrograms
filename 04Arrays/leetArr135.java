public class leetArr135 {
    public static void main(String[] args) {
        System.out.println(maxLength(new int[] {1,2,1,2,1,1,1})); // Expected: 5
        System.out.println(maxLength(new int[] {2,3,4,5,6}));     // Expected: 3
    }

    public static int maxLength(int[] nums) {
        int maxlen = 0;
        for (int i = 0; i < nums.length; i++) {
            maxlen = Math.max(maxlen, 1);

            long prod = nums[i];
            long gcd = nums[i];
            long lcm = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                gcd = GCD(gcd, nums[j]);
                lcm = (lcm / GCD(lcm, nums[j])) * nums[j];
                prod *= nums[j];
                if (prod == gcd * lcm)   maxlen = Math.max(maxlen, j - i + 1);
            }
        }
        return maxlen;
    }



    public static long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}
