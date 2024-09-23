import java.util.Arrays;

public class leetArr41 {
    public static void main(String[] args) {
        int[] nums ={2,2,1,1,2,2};
        
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println("h");
        int n = nums.length/2 ;
        int count = 0;
        for (int i = 0 ; i < nums.length-1 ; i++ ) {
            if ( nums[i] == nums[i+1] ) {
                count++;
            }
            else {
                count = 1;
            }
            if ( count > n) {
                System.out.println(nums[i]);
                return;
            }
        } 
    }
}
