import java.util.Stack;

public class leetArr42 {
   public static void main(String[] args) {
    //    String s = "leEeetcode";
       String s = "a";leetArr43.ja
    //    String s = "jeSsEJ";
    //    String s = "abBAcC";
    StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length()-1) {
            if ( Math.abs(sb.charAt(i) - sb.charAt(i+1)) == 32 ) {
                sb.delete(i, i+2);

                if ( i > 0 ) {
                    // sb.delete(i-1, i+1);
                    i--;
                    // System.out.println(sb.toString());
                }
            }
            // System.out.println(sb.toString());
            else {
                i++;
            }
        }
        System.out.println(sb.toString());
   } 
}
