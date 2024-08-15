public class Program23 {
    public static void main(String[] args) {
        String s = "leeetcode";

        String s1 = "" ;
        int count = 1 ;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i) ;

            if ( i == 0 || s.charAt(i) != s.charAt(i-1)) {
                s1 = s1.concat(s)ch ;
                count = 1 ;
            }
            else {
                count++ ;
                if ( count <= 2) {
                    s1 = s1 + ch ;
                }
            }

        }
        System.out.println(s1);
    }
}
