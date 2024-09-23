import java.util.Arrays;

public class leetArr45 {
    public static void main(String[] args) {
        int[] nums = {1,8,2,4,9};
        // int[] nums = {0,1,2,3,7,8};
        // Arrays.sort(nums);  //1,2,4,8,9
        int n = nums.length;
        int[] arr =new int[n+1];
        for (int i : nums) {
            if ( i > n ) {
                arr[n]++;
            }
            else {
                arr[i]++;
            }
        }
        int count =0 ;
        for (int i = n; i >= 0; i--) {
            count += arr[i];
            if ( count >= i ) {
                System.out.println(i);
                return;
            }
        }


    }
}
