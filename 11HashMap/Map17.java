import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Map17 {
    public static void main(String[] args) {
        System.out.println(minSwaps(new int[] {875031872,661889073,850559628}));
    }
    public static int minSwaps(int[] nums) {
    Map<Integer, PriorityQueue<Integer>> map = new TreeMap<>();

    for (int num : nums) {
        int sum = digitSum(num);
        map.computeIfAbsent(sum, k -> new PriorityQueue<>()).offer(num);
    }

    Map<Integer, Integer> sorted = new HashMap<>();
    int i = 0;

    for (int key : map.keySet()) {
        PriorityQueue<Integer> pq = map.get(key);

        while (!pq.isEmpty()) {
            sorted.put(pq.poll(), i++);
        }
    }

    System.out.println(sorted);

    // Your existing swap logic follows...
    int swaps = 0;

    for (int j = 0; j < nums.length; j++) {
        if (j == sorted.get(nums[j])) {
            continue;
        }

        int idx = sorted.get(nums[j]);
        sorted.put(nums[j], j);

        int num = nums[idx];
        sorted.put(num, idx);

        swaps++;
    }

    return swaps;
}
    public static int digitSum(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    } 
}
