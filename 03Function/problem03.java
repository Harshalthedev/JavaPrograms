import java.util.Scanner;
class problem03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum = sum +i;
        }
        System.out.println("the sum of number is: "+sum);
        sc.close();
    }    
}
