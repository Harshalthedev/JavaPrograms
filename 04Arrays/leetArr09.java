public class leetArr09 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4} ;
        int count = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[i] % 3 != 0  ) {
                if ( (nums[i] + 1) % 3 == 0 ) {
                    count++ ;
                }
                else if ((nums[i] - 1) % 3 == 0) {
                    count++ ;
                }
            }
        }
        System.out.println(count);
    }
}
