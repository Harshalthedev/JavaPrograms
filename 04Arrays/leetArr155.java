public class leetArr155 {
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching", "coding"));        
        System.out.println(appendCharacters("abcde", "a"));        
        System.out.println(appendCharacters("z", "abcde"));        
    }
    public static int appendCharacters(String s, String t) {
        int l = 0;
        int r = 0;
        while (l < s.length() && r < t.length()) {
            while (l < s.length() && r < t.length() && s.charAt(l) != t.charAt(r)) {
                l++;
            }
            if (l < s.length() && r < t.length() && s.charAt(l) == t.charAt(r)) {
                l++;
                r++;
            }
        }
        return t.length() - r;
    }
}