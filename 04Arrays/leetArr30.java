public class leetArr30 {
    public static void main(String[] args) {
        int[] nums = {1, -7, 9, -3, 1, -2, 8, -4, 5, 6};
        int max = 0 ;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];

            max = Math.max(max,cur);
            if (cur < 0) {
                cur = 0;
            }
        }
        System.out.println(max);
    }
}
