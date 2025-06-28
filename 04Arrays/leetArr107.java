import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class leetArr107 {
    public static void main(String[] args) {
        List<List<Integer>> res = mergeSimilarItems(new int[][] {{1,1},{4,5},{3,8}}, new int[][] {{3,1},{1,5}});
        System.out.println(res);
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> merge = new HashMap<>();
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < items1.length; i++) {
            int val = items1[i][0];
            int weight = items1[i][1];
            merge.put(val, weight);
            values.add(val);
        }
        for (int i = 0; i < items2.length; i++) {
            int val = items2[i][0];
            int weight = items2[i][1];
            merge.put(val, merge.getOrDefault(val, 0) + weight);
            values.add(val);
        }
        List<Integer> list = new ArrayList<>(values);
        Collections.sort(list);

        List<List<Integer>> res = new ArrayList<>();
        for (int val : list) {
            int weight = merge.get(val);
            res.add(new ArrayList<>(Arrays.asList(val, weight)));
        }
        return res;
    }
}
