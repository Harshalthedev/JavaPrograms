public class leetArr05 {
    public static void main(String[] args) {
        // int[] nums = {1,2,3,5,7,4};
        int[] nums = {1,2,10,5,7};
        // int[] nums = {1,1,1};
        // int[] nums = {2,3,1,2};
        int count = 0;
        int temp = 0;
        for ( int i = 0 ; i < nums.length-1 ; i++ ) {

            if ( temp > nums[i] && count == 1) {
                System.out.println(true);
                return ;
            }
            if (nums[i] == nums[i+1]) {
                System.out.println(false);
                return ;
            }
            if ( nums[i] > nums[i+1]) {
                count++ ;
                // System.out.println(false);
                temp = nums[i];
                // continue ;
            }
            if (nums[i] > nums[i+1]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
