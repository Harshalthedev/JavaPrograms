import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map13 {
    public static void main(String[] args) {
        System.out.println(minimumTeachings(2, new int[][] {{1},{2},{1,2}}, new int[][] {{1,2},{1,3},{2,3}}));
    }
    public static int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= languages.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int lang : languages[i - 1]) {
                set.add(lang);
            }
            map.put(i, set);
        }

        // Step 2: Find broken friendships
        List<int[]> broken = new ArrayList<>();
        for (int[] f : friendships) {
            int u = f[0], v = f[1];
            Set<Integer> set1 = map.get(u);
            Set<Integer> set2 = map.get(v);
            boolean canTalk = false;
            for (int lang : set1) {
                if (set2.contains(lang)) {
                    canTalk = true;
                    break;
                }
            }
            if (!canTalk) {
                broken.add(f);
            }
        }

        // Step 3: Try teaching each language
        int min = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            Set<Integer> toTeach = new HashSet<>();
            for (int[] f : broken) {
                int u = f[0], v = f[1];
                if (!map.get(u).contains(lang)) {
                    toTeach.add(u);
                }
                if (!map.get(v).contains(lang)) {
                    toTeach.add(v);
                }
            }
            min = Math.min(min, toTeach.size());
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
