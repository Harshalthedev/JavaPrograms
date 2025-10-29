import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map16 {
    public static void main(String[] args) {
        System.out.println(maxDistinctElements(new int[] {1,2,2,3,3,4}, 2));
        System.out.println(maxDistinctElements(new int[] {4,4,4,4}, 1));
    }
    public static int maxDistinctElements(int[] nums, int k) {
        List<Integer> range = new ArrayList<>();
        for (int i = -k; i <= k; i++) {
            range.add(i);
        }
        int n = range.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        Set<Integer> distinct = new HashSet<>();
        for (int key : map.keySet()) {
            if(!distinct.contains(key)) {
                distinct.add(key);
                map.put(key, map.get(key) -1);
            }
            for (int i = 0; map.get(key) > 0 && i < n; i++) {
                int newEle = key + range.get(i);
                if (!distinct.contains(newEle)) {
                    distinct.add(newEle);
                    map.put(key, map.get(key) -1);
                }
            }
        }
        return distinct.size();
    }
}
