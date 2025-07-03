public class leetArr113 {
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }
    public static char kthCharacter(int k) {
        StringBuilder sb1 = new StringBuilder(""+'a');

        while ( k >= sb1.length() ) {
            int n = sb1.length();
            for ( int i = 0; i < n ; i++ ) {    
                char ch = sb1.charAt(i);     
                if ( ch == 'z') ch = 'a';
                ch++;
                sb1.append(ch);
            }    
        }

        return sb1.charAt(k-1);
    }
}
