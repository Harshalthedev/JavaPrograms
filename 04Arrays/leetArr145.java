import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetArr145 {
    public static void main(String[] args) {
        int[][] res = sortTheStudents(new int[][] {{10,6,9,1}, {7,5,11,2}, {4,8,3,15}},2);
        for (int[] is : res) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        List<Integer> kMarks = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for ( int i = 0; i < m; i++) {
            map.put(score[i][k], i);
            kMarks.add(score[i][k]);
        }

        Collections.sort(kMarks);
        Collections.reverse(kMarks);
        int[][] res = new int[m][n];
        
        for (int i = 0; i < kMarks.size(); i++) {
            int row = map.get(kMarks.get(i));
            for (int j = 0; j < n; j++) {
                res[i][j] = score[row][j];
            }
        }
        return res;
    }
}
