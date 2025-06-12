import java.util.ArrayList;
import java.util.List;

public class leetArr92 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6, 5));
    }
    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i = 0;
        while ( list.size() > 1) {
            i = (i + k - 1) % list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}
