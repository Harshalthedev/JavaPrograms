import java.util.HashMap;

public class leetArr70 {
    public static void main(String[] args) {
        System.out.println(divideArray(new int[] {2,3,2,3,2,2}));    
    }
    public static boolean divideArray(int[] nums) {
        // if ( nums.length % 2 != 0) return false;
        int pairs = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        // if (map.size() > pairs) return false;
        int countPair = 0;
        for (int key : map.keySet()) {
            countPair += map.get(key)/2;
        }
        return (countPair == pairs);
    }
}
