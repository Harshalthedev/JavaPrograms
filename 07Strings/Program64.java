public class Program64 {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("aababbab"));
        System.out.println(minimumDeletions("bbbbbbbaabbbbbaaabbbabbbbaabbbbbbaabbaaabaabbbaaaabaaababbbabbabbaaaabbbabbbbbaabbababbbaaaaaababaaababaabbabbbaaaabbbbbabbabaaaabbbaba"));
    }
    public static int minimumDeletions(String s) {
        if (s.length() == 1) return 0;
        int min = 0;
        int b_cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'b') b_cnt++;
            else if (b_cnt > 0) {
                min = Math.min(min+1, b_cnt);
            }
        }
        return min;
    }
}
