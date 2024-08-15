public class leetArr14 {
    public static void main(String[] args) {
        int[] nums = {-6,2,5,-2,-7,-1,3};
        int target = -2;

        int count = 0;
        for ( int i = 0 ; i < nums.length; i++) {
            for ( int j = i+1 ; j < nums.length ; j++) {
                if(nums[i] + nums[j] < target){
                    count++;
                }
            }
        }
        System.out.println(count) ;
    }
}
