// import java.util.Stack;

public class Program11 {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|" ;
        boolean inBetweenPipe = false ;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!inBetweenPipe && ch == '*') {
                res++;
            }
            if ( ch == '|') {
                inBetweenPipe = ! inBetweenPipe ;
            }
        }
        System.out.println(res);

    }
}
