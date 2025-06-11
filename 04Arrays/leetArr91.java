import java.util.*;
public class leetArr91 {
    public static void main(String[] args) {
        // System.out.println(maxDifference("1122211", 3));    
        // System.out.println(maxDifference("12233", 4));    
        System.out.println(maxDifference("2421", 1));    
    }
    public static int maxDifference(String s, int k) {
        List<Integer> list = new ArrayList<>();
        int freq = 1;
        for ( int i = 1; i < s.length(); i++) {
            if ( s.charAt(i-1) == s.charAt(i)) {
                freq++;
            }
            else {
                list.add(freq);
                freq = 1;
            }
        }
        list.add(freq);
        System.out.println(list);
        int diff = Integer.MIN_VALUE;
        int least = 0, a = Integer.MIN_VALUE, b = Integer.MAX_VALUE;
        for (int fq : list) {
            least += fq;
            if ( fq % 2 != 0 && fq > a) a = fq;
            else if (fq < b) b = fq;
            if ( least >= k) {
                diff = Math.max(diff, a-b);
            }
        }
        // System.out.println(list);
        return diff;
    }
}
