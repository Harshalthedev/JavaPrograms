public class Program23 {
    public static void main(String[] args) {
        System.out.println(removeA("aabacaaaacad", ""));
    }
    public static String removeA(String s, String newStr) {
        if (s.length() == 0) {
            return newStr;
        }
        if(s.charAt(0) != 'a') newStr += s.charAt(0);
        return removeA(s.substring(1, s.length()), newStr);
    }

}
