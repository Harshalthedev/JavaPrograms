import java.util.*;
public class leetArr120 {
    public static void main(String[] args) {
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        // int[][] logs = {{1,1},{2,2},{2,3}};
        // int k = 4;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < logs.length; i++) {
            if (map.containsKey(logs[i][0])) {
                Set<Integer> set = map.get(logs[i][0]);
                set.add(logs[i][1]);
                map.put(logs[i][0], set);
            }
            else {
                map.put(logs[i][0], new HashSet<>());
                map.get(logs[i][0]).add(logs[i][1]);
            }
        }   
        System.out.println(map);
        int[] res = new int[k];
        for (int key : map.keySet()) {
            int size = map.get(key).size();
            res[size-1]++;
        }
        System.out.println(Arrays.toString(res));
    }
}
