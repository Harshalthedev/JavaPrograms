public class Program62 {
    public static void main(String[] args) {
        System.out.println(removeSubstring("(())", 1));
    }
    public static String removeSubstring(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k*2; i++) {
            if (i < k) sb.append("(");
            else sb.append(")");
        }
        int atIdx = s.indexOf(sb.toString());
        String str = s.substring(0, atIdx);
        System.out.println(atIdx + 2*k);
        if ((atIdx + 2*k) < s.length()) {
            str = str + s.substring(atIdx+k*2, s.length());
        }
        return str;
    }
}
