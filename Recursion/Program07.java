class Program07 {
    public static void main(String[] args) {
        int n = 121;  
        reverse(n,0);
        if ( reverse(n,0) == n) {
            System.out.println(true);
        }      
        else System.out.println(false);
    }

    static int reverse(int n, int rev ) {
        if ( n == 0) return rev;
        return  reverse(n/10, (10*rev)+(n%10));
    } 
}