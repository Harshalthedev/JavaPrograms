import java.util.HashMap;

public class leetArr117 {
    public static void main(String[] args) {
        int[] nums = {2,7,3,6}; int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target-nums[i];
            if (map.containsKey(num)) {
                System.out.println(map.get(num)+" "+i);
                return;
            }
            map.put(nums[i], i);
        }
    }
}
