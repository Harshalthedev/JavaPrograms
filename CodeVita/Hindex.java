import java.util.*;
public class Hindex {
    public static void main(String[] args) {
        String s = "xxxxbbbccc";
        int max = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();

        int r = 0;
        while (r < s.length()) {
            if ( sb.toString().contains(Character.toString(s.charAt(r))) ) {
                max = Math.max(max, sb.toString().length());
                while ( sb.toString().contains(Character.toString(s.charAt(r))) ) {
                    sb.deleteCharAt(0);
                }
            }
            else {
                sb.append(s.charAt(r));
                r++;
            }
        }

        System.out.println( (sb.length() > max) ? sb.length(): max);
    }
}
