import java.util.*;
public class leetArr24 {
    public static void main(String[] args) {
        // int[] nums = {19,19,19,19};
        int[] nums = {19,19,19,20,19,8,19};
        // int[] nums = {1,2,2,3,1,4};
        Arrays.sort(nums);
        // int[] nums = {8,19,19,19,19,19,20};
        int sum = 0;

        for ( int i = 1 ; i < nums.length-1 ; i++ ){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i-1] == nums[i]){
                    sum++;
                }
            }
        }
        if(sum == 0 ) {
            System.out.println(nums.length);
        }
        System.out.println(sum);
        return;
    }
}
