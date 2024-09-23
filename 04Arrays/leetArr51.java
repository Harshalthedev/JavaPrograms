public class leetArr51 {
    public static void main(String[] args) {
        int[] nums = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int l = 0 ; 
        int r = nums.length-1 ;
        int max = Integer.MIN_VALUE;
        int lSum = 0;
        int rSum = 0;
        while ( l < k ) {
            lSum += nums[l];
            l++;
        }
        l--;
        max = lSum;
        while (l >= 0 && r >= nums.length-k) {
            lSum -= nums[l];
            rSum += nums[r];
            // int sum = lSum + rSum;
            max = Math.max(max, ((lSum -= nums[l]) + (rSum +=nums[r])));
            l--;
            r--;
        }
        
        System.out.println(max);

    }
}
