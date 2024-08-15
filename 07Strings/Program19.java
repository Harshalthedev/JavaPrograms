public class Program19 {
    public static void main(String[] args) {
        String s = "har2shal" ;
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i) ;
            if (ch >= 'a' && ch <= 'z') {
                s1 += ch ;
            }
            else if (s1.length() > 0) {
                s1 = s1.substring(0, s1.length()-1);
            }
        }
        System.out.println(s1);
    }
}
