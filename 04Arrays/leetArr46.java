import java.util.*;
class leetArr46 {
    public static void main(String[] args) {
        String s = "cars";
        String[] wordDict = {"car","ca","rs"};
        
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        for ( String word : wordDict ) {
            set.add(word);
        }
        int i = 0;
        while ( i <= sb.length() ) {
            sb.append(s.charAt(i));
            // System.out.println(sb.toString());
            if ( set.contains(sb.toString()) ) {
                set.remove(sb.toString());
                // System.out.println(set);
                sb.delete(0,sb.length());
                // System.out.println(sb.toString());
                i = 0;
            }
            else i++;
        }
        if ( set.isEmpty() ) {
            System.out.println(true);
        }
        else    System.out.println(true);
    }
}