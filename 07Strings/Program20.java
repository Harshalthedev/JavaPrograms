public class Program20 {
    public static void main(String[] args) {
        String s = "a1c1e1" ;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i+=2) {

            // if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
            //     sb.append(s.charAt(i));
            // }
            // else {
                char ch = (char)(s.charAt(i-1) + (int)(s.charAt(i) - '0'));
                sb.append(ch);
            // }
        }
        System.out.println(sb.toString());
    }
}
