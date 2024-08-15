public class leetArr16 {
    public static void main(String[] args) {
        int[] nums = {2,7,1,19,18,3};
        // int[] nums = {1,2,3,4};
        int n = nums.length;
        int spe_ele = 0 ;

        for ( int i = 1 ; i <= n ; i++ ) {
            if ( n % i == 0) {
                spe_ele = spe_ele + (nums[i-1] * nums[i-1]) ;
            }
        }
        System.out.println(spe_ele);
    }
}
