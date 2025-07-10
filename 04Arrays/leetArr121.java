import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetArr121 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[] {3,2,3,4,2})));
    }
    public static int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
            prefix[i] = set1.size();
        }
        int[] suffix = new int[n];
        Set<Integer> set2 = new HashSet<>();
        for (int i = n-1; i >= 0; i--) {
            if (!set2.contains(nums[i])) {
            set2.add(nums[i]);
            suffix[i] = set2.size()-1;
            }
            else suffix[i] = set2.size();
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = prefix[i] - suffix[i];
        }
        return res;
    }
}
