import java.util.*;

public class leetArr50 {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".

        int l = 0 ; 
        int r = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        char[] ch1 = p.toCharArray();
        Arrays.sort(ch1);
        sb.append(s.subSequence(0, p.length()-1));
        while (r < s.length()) {
            sb.append(s.charAt(r));
            while (true ) {
                char[] ch = sb.toString().toCharArray();
                Arrays.sort(ch);
                if ( Arrays.equals(ch, ch1)) list.add(r-p.length()-1);
            }
        }
    }
}
