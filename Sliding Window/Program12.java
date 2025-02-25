import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program12 {
    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[] {9,5,7,8,7,9,8,2,0,7}));
    }
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Set<Float> set = new HashSet<>();
        int l = 0;
        int r = nums.length-1;
        while ( l <= r ) {
            Float avg =(float) ((nums[l]+nums[r])/2f);
            System.out.println(avg);
            set.add(avg);
            l++;
            r--;
        }
        return set.size();
    }
}
