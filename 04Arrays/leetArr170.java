import java.util.Arrays;
import java.util.List;

public class leetArr170 {
    public static void main(String[] args) {
        System.out.println(hasIncreasingSubarrays(Arrays.asList(2,5,7,8,9,2,3,4,3,1), 3));
        System.out.println(hasIncreasingSubarrays(Arrays.asList(-15,19), 1));
    }
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        
        int l = 0, r = k * 2 - 1;

        while (r < n) {
            if (subarray(nums, l, r)) return true;
            l++;
            r++;
        }
        return false;
    }
    public static boolean subarray(List<Integer> nums, int start, int end) {
        // if(start == end) return true;
        int mid = start + (end - start)/2;
        int i = start;
        while (i < mid) {
            if (nums.get(i) < nums.get(i+1)) i++;
            else return false;
        }
        i = mid+1;
        while (i < end) {
            if (nums.get(i) < nums.get(i+1)) i++;
            else return false;
        }
        return true;
    }
}
