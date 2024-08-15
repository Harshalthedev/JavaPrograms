public class leetArr11 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4, 4,3,2,1} ;
        int n = 4 ;
        int i =1 ;
        for (int j = n; j < nums.length; j++) {
            int temp = nums[i] ;
            nums[i] = nums[j];
            int temp2 = nums[i+1] ;
            nums[i+1] = temp ;
            i += 3;
        }            
        for (int m : nums) {
            System.out.print(m+" ");
        }

    }   
}
// [1,4,2,3,3,2,4,1]