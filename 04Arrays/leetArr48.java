public class leetArr48 {
    public static void main(String[] args) {
        // no. of subarrays with sum = k;
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int minlen = nums.length+1;
        int curSum = 0;
        int count_sa = 0;
        int l = 0;
        int r = 0;
        while ( r < nums.length) {
            curSum += nums[r];
            while (curSum > target && l <= r) {
                curSum -= nums[l];
                l++;
            }
            if ( curSum == target ) {
                count_sa++;
            }
            r++;
        }
        System.out.println(count_sa);
    }
}
