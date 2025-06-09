import java.util.*;
import java.util.stream.Gatherer.Integrator;
public class leetArr89 {
    public static void main(String[] args) {
        System.out.println(findKthNumber(13, 2));    
    }
    public static int findKthNumber(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, list);
        }
        return list.get(k-1);
    }
    public static void dfs(int num, int n, List<Integer> list) {
        if(num > n) return;
        list.add(num);
        for (int i = 0; i <= 9; i++) {
            int nextInt = 10 * num + i;
            if (nextInt > n) return;
            dfs(nextInt, n, list);
        }
    }
}
