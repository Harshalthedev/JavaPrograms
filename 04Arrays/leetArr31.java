public class leetArr31 {
    public static void main(String[] args) {
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-2,-1};

        // int max_Sum = Integer.MIN_VALUE ;
        int max_Sum = nums[0] ;
        int cur_Sum = 0;

        for ( int i = 0 ; i < nums.length; i++ ) {
           
            cur_Sum += nums[i];
            max_Sum = Math.max(max_Sum,cur_Sum); 

            if ( cur_Sum < 0 ) {
                cur_Sum = 0;
            }
        }
        System.out.println(max_Sum);
    }
}
