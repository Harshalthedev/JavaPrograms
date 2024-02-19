import java.util.Scanner;
class Method03
{
    public static void num(int x)
    {
        for(int i=1;i<=x;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit of the number: ");
        int x = ob.nextInt();
        num(x);
        ob.close();
        // System.out.println("the numbers are: "+i);
    }
}