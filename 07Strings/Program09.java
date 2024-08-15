
public class Program09 {
    public static void main(String[] args) {
        String s = "ab#cc#";
        String t = "ad#c";
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            // char ch = s.charAt(i);
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                s1 = s1 + s.charAt(i);
            }
            else if (s1.length() > 0) {
                s1 = s1.substring(0,s1.length()-1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            // char ch = t.charAt(i);
            if ('a' <= t.charAt(i) && t.charAt(i) <= 'z'){
                s2 = s2 + t.charAt(i);
            }
            else if (s2.length() > 0 ){
                s2 = s2.substring(0,s2.length()-1);
            }
        }
        if(s1.equals(s2)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        
    }
}
