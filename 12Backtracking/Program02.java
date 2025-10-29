import java.util.ArrayList;
import java.util.List;

public class Program02 {
    private static List<String> list;
    public static void main(String[] args) {
        list = new ArrayList<>();
        permutation("abc", "");
        System.out.println(list);
    }
    static void permutation(String up , String p ) {
        if ( up.isEmpty()) {
            list.add(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            String f = up.substring(0,i) + up.substring(i+1);
            char s = up.charAt(i);
            permutation(f, p + s);   
        }

    }
}
