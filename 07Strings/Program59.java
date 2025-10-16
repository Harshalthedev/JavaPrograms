import java.util.Arrays;

public class Program59 {
    public static void main(String[] args) {
        // System.out.println(longestStrChain(new String[] {"a","b","ba","bca","bda","bdca"}));
        // System.out.println(longestStrChain(new String[] {"xbc","pcxbcf","xb","cxbc","pcxbc"}));
        // System.out.println(longestStrChain(new String[] {"abcd","dbqca"}));
        System.out.println(longestStrChain(new String[] {"a","ab","ac","bd","abc","abd","abdd"}));

    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for (String string : words) {
            System.out.print(string+" ");
        }
        int n  = words.length;
        int longGrp = 1;

        for (int i = 0; i < n; i++) {
            int prev = i;
            int grp = 1;
            for (int j = i+1; j < n; j++) {
                if (words[prev].length() - words[j].length() != -1) continue;
                int k1 = 0;
                boolean found = false;
                while (k1 < words[j].length()) {
                    int k2 = 0;
                    while (k2 <= words[prev].length()) {
                        String c = words[prev].substring(0, k2) + words[j].charAt(k1) + words[prev].substring(k2);
                        if (c.equals(words[j])) {
                            prev = j;
                            found = true;
                            break;
                        }
                        k2++;
                    }
                    if (found) break;
                    k1++;
                }
                if (found) grp++;
            }
            longGrp = Math.max(longGrp, grp);
        }
        return longGrp;
    }
}
