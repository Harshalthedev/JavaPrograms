public class code3 {
    public static void main(String[] args) {
        int[] arr = {25,10,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(solve(arr[i]));
        }
    }
    public static int solve(int n) {
        if (n <= 9) {
           return n; 
        }
        else if ( n % 2 == 0) {
            return (n-2)/2;
        }
        return n/2;
    }
}
