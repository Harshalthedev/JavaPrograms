import java.util.Arrays;
import java.util.HashMap;

public class leetArr106 {
    public static void main(String[] args) {
        int[] res = maxSubsequence(new int[] {-1,-2,3,4}, 3);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
     static int[] maxSubsequence(int[] nums, int k) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = n-1; i >= n-k; i--) {
            map.put(copy[i], map.getOrDefault(copy[i], 0)+1);
        }
        int[] arr = new int[k];
        int count = 0;
        for ( int i = 0; i < nums.length; i++) {
            if (count < k && map.containsKey(nums[i]) && map.get(nums[i]) > 0) {
                arr[count++] = nums[i];
                map.put(nums[i], map.get(nums[i])-1);
            }
        }
        return arr;
    }
}
