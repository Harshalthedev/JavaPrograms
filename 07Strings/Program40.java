import java.util.*;
public class Program40 {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        // String s = "ab-cd";
        char[] str = s.toCharArray();

        int l = 0;
        int h = s.length()-1;

        while ( l <= h ) {
            if ( !Character.isLetter(str[l])) {
                l++;
            }
            if ( !Character.isLetter(str[h])) {
                h--;
            }
            else {
                char ch = str[l];
                str[l] = str[h];
                str[h] = ch;
                h--;
                l++;
            }
        }

        System.out.println(new String(str));
    }
}
