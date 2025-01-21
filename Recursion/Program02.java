public class Program02 {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13
        int n = 6;
        System.out.print(0+" "+1+" ");
        fibonacci ( 0 , 1 , n-2);
    }
    static void fibonacci ( int a , int b , int n) {
        if ( n == 0 ) {
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);
    }
}
