public class leetArr19 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int count = 0 ;
        for ( int i = 0 ; i < nums.length-1; i++ ) {
            if(nums[i] == nums[i+1]) {
                    count++;
                System.out.println(count);
            }
            else if (nums[i] > nums[i+1]) {
                    count = count + (nums[i] - nums[i+1])+1;
                    System.out.println(count);
                    nums[i+1] = nums[i]+1;
                    // System.out.println(nums[i+1]); 
            }
        }
        System.out.println(count ) ;
    }
}
