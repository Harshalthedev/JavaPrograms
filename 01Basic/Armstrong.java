import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int rem = 0, sum =0, temp =n ;
        while(n > 0) {
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(temp == sum) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
