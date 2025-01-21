import java.util.HashSet;
import java.util.Set;

public class Program42 {
    public static void main(String[] args) {
        String s = "au";
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int l = 0;
        int r = 0;
        for (; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);

        }
        System.out.println(max);
    }
}
