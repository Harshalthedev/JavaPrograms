public class leetArr111 {
    public static void main(String[] args) {
        System.out.println(possibleStringCount("abbcccc"));
        System.out.println(possibleStringCount("ere"));
    }
    public static int possibleStringCount(String word) {
        int cnt = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i-1)) {
                cnt++;
            }
        }
        return cnt;
    }
}
