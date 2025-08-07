import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetArr150 {
    public static void main(String[] args) {
        int[][] res = merge(new int[][] {{8,10},{1,3},{2,6},{15,18}});
        for (int[] is : res) {
            System.out.println(is[0]+" "+is[1]);
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]- b[0]);
        List<int[] > list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (list.isEmpty() || list.get(list.size()-1)[1] < interval[0]) {
                list.add(interval);
            }
            else {
                list.get(list.size()-1)[1] = Math.max(interval[1], list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
