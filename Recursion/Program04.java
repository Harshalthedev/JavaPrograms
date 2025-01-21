public class Program04 {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fac(n));
    }    
    static int fac( int n ) {
        if ( n  == 1 ) {
            return 0 ;
        }
        return n * fac(n-1);
    }
}
