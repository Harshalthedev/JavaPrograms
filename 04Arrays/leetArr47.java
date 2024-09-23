public class leetArr47 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,7,10};
        int k = 14;

        int max = nums[0]; 
        int cursum = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];
            if (cursum > k) {
                cursum -= nums[l];
                l++;
            }
            if ( cursum <= k) {
                max = Math.max(max, cursum);
            }
        }
        System.out.println(max);
    }
}
