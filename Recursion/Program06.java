public class Program06 {
    public static void main(String[] args) {
        int n = 105;
        int ds = digitSum(n);
        System.out.println(ds);
    }
    static int digitSum( int n ) {
        if ( n%10 == 0 ) {
            return n;
        }
        return (n%10) * digitSum(n/10);
    }
}
