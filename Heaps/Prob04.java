import java.util.*;
import java.util.PriorityQueue;

public class Prob04 {
    public static void main(String[] args) {
        System.out.println(maximumImportance(5,new int[][] {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}}));
        System.out.println(maximumImportance(5,new int[][] {{0,3},{2,4},{1,3}}));
    }
    public static long maximumImportance(int n, int[][] roads) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] road : roads) {
            map.put(road[0], map.getOrDefault(road[0], 0) + 1);
            map.put(road[1], map.getOrDefault(road[1], 0) + 1);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]);  
            }
            return Integer.compare(a[0], b[0]);  
        });

        for (int key : map.keySet()) {
            pq.offer(new int[]{key, map.get(key)});
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            map2.put(arr[0], n--);
        }
        long ans = 0;
        for (int[] road : roads) {
            ans += (long) (map2.get(road[0])) + (long) (map2.get(road[1]));
        }
        return ans;
    }
}
