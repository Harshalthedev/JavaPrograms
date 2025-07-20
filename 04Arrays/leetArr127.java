import java.util.ArrayList;
import java.util.List;

public class leetArr127 {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for (String s : bank) {
            int cnt = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '1') cnt++;
            }
            if(cnt > 0) list.add(cnt);
        }
        int sum = 0;
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i) * list.get(i-1);
        }
        return sum;
    }
}
