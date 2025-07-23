public class leetArr132 {
    public static void main(String[] args) {
        System.out.println(maximumGain("cdbcbbaaabab", 4, 5));
        System.out.println(maximumGain("aabbaaxybbaabb", 5, 4));
    }
    public static int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);

        String a = null;
        String b = null;
        if (x > y) {
            a = "ab";
            b = "ba";
        }
        else {
            a = "ba";
            b = "ab";
        }
        int max = 0;
        while (sb.indexOf(a) > -1 || sb.indexOf(b) > -1) {
            int ab = sb.indexOf(a);
            while (ab > -1) {
                max += Math.max(x, y);
                sb.delete(ab, ab+2);
                ab = sb.indexOf(a);
            }
            int ba = sb.indexOf(b);
            if (ba > -1) {
                max += Math.min(x, y);
                sb.delete(ba, ba+2);
            }
        }
        return max;
    }
}
