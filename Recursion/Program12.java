public class Program12 {
    public static void main(String[] args) {
        String s = "baccapplead";
        System.out.println(newString(s));
        skip(s, "");
    }
    static String newString(String s ) {
        if ( s.isEmpty()) return "";
        char ch = s.charAt(0);
        if ( ch == 'a') {
            return newString(s.substring(1));
        }
        else {
            return s.charAt(0) + newString(s.substring(1));
        }
    }
    static void skip(String s , String s1) {
        if ( s.isEmpty()) {
            System.out.println(s1);
            return;
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            skip(s.substring(1),s1);
        }
        else skip(s.substring(1),s1+ch);
    }
}