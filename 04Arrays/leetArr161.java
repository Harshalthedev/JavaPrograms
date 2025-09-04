public class leetArr161 {
    public static void main(String[] args) {
        System.out.println(multiCharac("aabbbbeeeeffggg"));
    }
    public static String multiCharac(String s) {
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;                
            }
            else {
                sb.append(s.charAt(i)).append(cnt);
                cnt = 1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(cnt);
        return sb.toString();
    }
}
