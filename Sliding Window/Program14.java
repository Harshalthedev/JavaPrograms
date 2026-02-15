import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        System.out.println(minLength(new int[] {2,2,3,1}, 4));
    }
    public static int minLength(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while (r < n) {
            if (!set.contains(nums[r])) {
                set.add(nums[r]);
                sum += nums[r];
                if (map.containsKey(sum)) {
                    int len = map.get(sum);
                    int newLen = len > r-l+1 ? r-l+1 : len;
                    map.put(sum, newLen);
                }
                else map.put(sum, r-l+1);
            }
            else {
                
            }
        }
    }
}
