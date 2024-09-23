public class leetArr49 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int l = 0;
        int r = 0;
        int min = nums.length+1;
        int curSum = 0;
        while ( r < nums.length) {
            curSum += nums[r];
            while (curSum >= target) {
                curSum -= nums[l];
                min = Math.min(min, r-l +1);
                l++;
            }
            r++;
        } 
        System.out.println( (nums.length+1 == min ) ? 0 : min);
    }
}
