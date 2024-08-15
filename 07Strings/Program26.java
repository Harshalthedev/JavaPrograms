import java.util.*;
public class Program26 {
    public static void main(String[] args) {
        String s = "cbbd";
        // String s = "baadccab";
        
        int count = 0;

        for ( int i = 0 ; i < s.length() ; i++ ) {
            
            if( s.indexOf(s.charAt(i)) > i-1) {
                count ++;
            }

        }
         System.out.println(count) ;
    }
}
