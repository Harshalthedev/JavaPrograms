import java.util.*;
public class main {
    public static void main(String[] args) {
        // int[] nums = {-1,10,6,7,-7,1};
        // int[] nums = {-1,2,-3,3};
        int[] nums = {26,44,7,44,16,42,-39,-38,-42,-37,33,8,3,-4,38,6,24,49,-32,-10,11,-20,48,-21,-18,-21,47,29,-13,-32,-2,9,-41,-41,18,9,-24,-31,-42,-3,45,-20,-34,-16,-40,12,48,-18,-22,-13,35,28,15,39,-11,-23,15,-5,-12,32,2,28,-50,-7,4,-36,5,-15,-30,-4,34,17,18,36,-32,49,1};
        int max = 0;
        // for ( int i = 0 ; i < nums.length-1; i++ ) {
        //     for (int j = i+1 ; j < nums.length ;j++ ) {
        //         if ( nums[i] == nums[j]*-1 && (nums[j] > max || nums[i] > max)) {
        //             max = Math.abs(nums[j]);
        //         }
        //     }
        // }
        Arrays.sort(nums);
        int l = 0;
        int h = nums.length-1;
        while ( l <= h ) {
            if ( nums[l]+ nums[h] == 0) {
                max = Math.abs(nums[l]);
                System.out.println(max);
                return;
            }

            if (-(nums[l]) > nums[h]) l++;
            
            else h--;
        }

        System.out.println(max);
    }
}
