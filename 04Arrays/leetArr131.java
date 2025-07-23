public class leetArr131 {
    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("abcd"));
    }
    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        sb.append(s.charAt(0));
        char[] ch = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (ch[i] == ch[i-1]) {
                cnt++;
            }
            else {
                cnt = 1;
            }
            if (cnt < 3)sb.append(ch[i]);
        }
        return sb.toString();
    }
}
