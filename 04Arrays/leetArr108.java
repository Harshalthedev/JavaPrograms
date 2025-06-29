import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetArr108 {
    public static void main(String[] args) {
        System.out.println(partitionString("abbccccd"));
    }
    public static List<String> partitionString(String s) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            String seg = sb.toString();
            if (!set.contains(seg)) {
                set.add(seg);
                res.add(seg);
                sb.setLength(0);
            }
        }
        return res;
    }
}
