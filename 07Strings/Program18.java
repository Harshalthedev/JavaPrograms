import java.util.Arrays;

public class Program18 {
    public static void main(String[] args) {
        // char[] s = {'h','e','l','l','o'} ;
        char[] s = {'H','a','n','n','a','h'} ;
        for ( int i = s.length-1 ; i >= 0 ; i-- ) {
            System.out.print(Arrays.toString(s[i]));
        }
    }
}
