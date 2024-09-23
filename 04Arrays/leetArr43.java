import java.util.Arrays;
public class leetArr43 {
    public static void main(String[] args) {
        int[] nums = {1,9,8,3,10,5};
        Arrays.sort(nums);
        double min_avg = Integer.MAX_VALUE;
        int l = 0 ;
        int h = nums.length-1;
        while ( l < h ) {
            min_avg = Math.min(( nums[l++] + nums[h--])/2f , min_avg);
        }
        System.out.println(min_avg);
    }
}
