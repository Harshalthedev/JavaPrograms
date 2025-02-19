public class Map05 {
    public static void main(String[] args) {
        String s = "abacbc";
        // areOccurrencesEqual(s);
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
    
        for ( char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = freq[s.charAt(0) - 'a'];
        for ( char ch : s.toCharArray()) {
            if (freq[ch - 'a'] != count) {
                return false;
            } 
        }
 
        // System.out.println(true);
        return true;
    }
}
