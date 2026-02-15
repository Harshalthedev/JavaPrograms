import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetArr181 {
    public static void main(String[] args) {
        String s = "harshal";
        System.out.println(s.substring(0,1));
        System.out.println(firstUniqueFreq(new int[] {20,20,10,30,30,30}));
        System.out.println(firstUniqueFreq(new int[] {20,20,10,10}));
        System.out.println(firstUniqueFreq(new int[] {20,10,30,30}));
    }
    public static int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int key : map.keySet()) {
            int val = map.get(key);
            if (set1.contains(val)) set2.add(val);
            set1.add(val);
        }
        Set<Integer> uni = new HashSet<>();
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (!set2.contains(val)) uni.add(key);
        }
        for (int num : nums) {
            if (uni.contains(num)) return num;
        }
        return -1;  
    }
}
