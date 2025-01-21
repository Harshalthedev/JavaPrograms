import java.util.*;
public class Program41 {
    public static void main(String[] args) {
        String s = "xxxxbbbccc";
        int max = 0;
        StringBuilder sb = new StringBuilder();

        int r = 0;
        while (r < s.length()) {
            if ( sb.toString().contains(Character.toString(s.charAt(r))) ) {
                while ( sb.toString().contains(Character.toString(s.charAt(r))) ) {
                    sb.deleteCharAt(0);
                }
            }
            else {
                sb.append(s.charAt(r));
                max = Math.max(max, sb.length()); 
                r++;
            }
        }

        System.out.println(max);
    }
}
