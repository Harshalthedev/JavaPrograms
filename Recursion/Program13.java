public class Program13 {
    public static void main(String[] args) {
        String s = "bcaappapplexcbv";
        // System.out.println(skipApple(s));
        System.out.println(skip(s));
    }
    static String skip(String s) {
        if ( s.isEmpty()) {
            return "";
        }
        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skip(s.substring(3));
        }
        else return s.charAt(0)+ skip(s.substring(1));
    }
}
