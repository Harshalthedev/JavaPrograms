public class Program53 {
    public static void main(String[] args) {
        System.out.println(smallestString("abaacbac"));
    }
    public static String smallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i-1) == 'b' && sb.charAt(i) == 'a' || 
            sb.charAt(i-1) == 'c' && sb.charAt(i) == 'b') {
                char temp = sb.charAt(i-1);
                sb.setCharAt(i-1, sb.charAt(i));
                sb.setCharAt(i, temp); 
            }
        }
        return sb.toString();
    }
}
