public class leet04 {
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,0,4,5};
        int count = 0;


        for ( int i = 0 ; i < nums.length ; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if ( nums[i] == 0 && nums[j] == 0 ) {
                    int temp = nums[i];
                    nums[i] = nums[j+1] ;
                    nums[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
