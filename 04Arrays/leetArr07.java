import java.util.ArrayList;

public class leetArr07 {
    public static void main(String[] args) {

        // String[] words = { "leet","code" } ;
        String[] words = { "abc","bcd","aaaa","cbc"} ;
        char x = 'a'  ;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i] ;
            int n = s.indexOf(x) ;
            if (n >= 0) {
                list.add(i);
                n = -1 ;
            }
        } 
        System.out.println(list);
    }
}
