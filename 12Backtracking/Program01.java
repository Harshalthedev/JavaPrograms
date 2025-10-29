import java.util.ArrayList;
import java.util.List;

public class Program01 {
    private static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int sum = 3;
        List<Integer> res = new ArrayList<>();
        backtrack(res, sum, 0, 1);
    }
    public static void backtrack(List<Integer> res, int sum, int curSum, int start) {
        if (sum == curSum) {
            list.add(new ArrayList<>(res));
        }
        for (int i = start; i < 10; i++) {
            if (curSum + start <= sum) {
                res.add(start);
                
            }
        }
    }
}
