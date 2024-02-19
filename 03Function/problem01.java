import java.util.Scanner;
class problem01
{
    public static int mul(int x)
    {
        if(x%3==0 & x%5==0)
        {
            System.out.println("the number is multiple of both 3 and 5");
        }
        else
        {
            System.out.println("given number is not multiple of both");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = ob.nextInt();
        mul(x); 
        ob.close();
    }  
}
