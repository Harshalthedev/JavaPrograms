public class Program22 {
    public static void main(String[] args) {
        String s = "aaabaaaa" ;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for ( int i = 0; i < s.length() ; i++ ) {

            char ch = s.charAt(i) ;

            if ( i == 0 || s.charAt(i) != s.charAt(i-1)) {
                sb.append(ch);
                count = 1 ;
            }
            else {
                count++;
                if (count <= 2) {
                    sb.append(ch);
                }
            }

        }
        System.out.println(sb.toString());
    }
}
