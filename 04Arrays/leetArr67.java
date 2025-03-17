import java.util.HashSet;

public class leetArr67 {
    public static void main(String[] args) {
        System.out.println(countOfSubstrings("ieaouqqieaouqq",1));
        System.out.println(countOfSubstrings("aeiou",0));
        System.out.println(countOfSubstrings("aeioqq",1));
    }
    public static int countOfSubstrings(String word, int k) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            int cntConsonant = 0;
            for ( int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (isVovel(ch)) set.add(ch);
                else cntConsonant++;
                if (cntConsonant > k) break;
                // System.out.println(set.size());
                if(set.size() == 5 && cntConsonant == k) {
                    count++;
                }
            }
            set.clear();
        }
        return count;
    }
    public static boolean isVovel( char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
