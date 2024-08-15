public class palindrome {
    public static void main(String[] args) {
        int n = 101;
        int temp =n,sum=0,rem;
        while(n > 0) {
            rem = n %10;
            n = n/10;
            sum = (sum*10) + rem;
        }
        if( temp == sum) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
