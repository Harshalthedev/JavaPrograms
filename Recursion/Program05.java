public class Program05 {
    public static void main(String[] args) {
        int n = 5;
        int sum = Sum(n);
        System.out.println(sum);
    } 
    static int Sum( int n ) {
        if ( n == 0) {
            return 0;
        }
        return n + Sum(--n);
    }   
}
