import java.util.ArrayList;
import java.util.List;

public class Program18 {
    public static void main(String[] args) {
        String s = "12";
        // permutation(s , "");
        System.out.println(permutationRet(s , ""));
    }
    // static void permutation(String up, String p) {
    //     // ArrayList<String> list = new ArrayList<>();
    //     if ( up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     int  digit = up.charAt(0) - '0';
    //     for (int i = (digit-1)*3; i < digit*3; i++) {
    //         char ch = (char) ('a'+i);
    //         permutation(up.substring(1), p+ch);
    //     }
    // }
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> permutationRet(String up, String p) {
        if ( up.isEmpty()) {
            list.add(p);
            return list;
        }
        int  digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            permutationRet(up.substring(1), p+ch);
        }
        return list ;
    }
}
