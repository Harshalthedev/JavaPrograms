import java.util.Arrays;
import java.util.HashMap;

public class Map09 {
    public static void main(String[] args) {
        System.out.println(countFairPairs(new int[] {0,1,4,4,5,7}, 3, 6));
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        HashMap<Long,Long> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            long a = nums[i];
            for (int j = i+1; j < n; j++) {
                long b = nums[j];
                long sum = a+b;
                if ( lower <= sum && sum <= upper) {
                    if (map.containsKey(a) && map.get(a) != b) {
                        count++;
                    }
                    else map.put(a,b);
                }
                else if (sum > upper) break;
            }
            System.out.println(map);
        }
        return (long) map.size();
    }
}
