import java.util.Scanner;
public class Prog_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        sc.close();

                                                                  // int a=0,b=1,c;
                                                                  // System.out.print(a+" "+b);
                                                                  // while(n-2>0)
                                                                  // {
                                                                  //     c = a+b;
                                                                  //     System.out.print(" "+c);
                                                                  //     a = b;
                                                                  //     b = c;
                                                                  //     n--;
                                                                  // }
        
        fibonacci(0, 1, n);
    }

    public static void fibonacci(int a, int b, int n) {
        if (n <= 0) {
            return ;
        }
        System.out.print(a + " ");
        fibonacci(b, a + b, n - 1);
    }
}

