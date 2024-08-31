public class Program35 {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        StringBuilder sb = new StringBuilder(s);

        for ( int i = 0 ; i < s.length() ; i++ ) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if ( sb.toString().equals(goal)) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);;
    }
}
