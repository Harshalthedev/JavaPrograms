public class Program05 {
    public static void main(String[] args) {
        int k = 10;
        char letter = 'a';
        StringBuilder sb1 = new StringBuilder(String.valueOf(letter));
        
        while ( k > sb1.length() ) {
            int n = sb1.length();  
            for ( int i = 0; i < n ; i++ ) {    
                char ch = sb1.charAt(i);     
                if ( ch == 'z') ch = 'a';
                ch++;
                sb1.append(ch);
            }
        }

        System.out.println(sb1.charAt(k-1));
    }
}
