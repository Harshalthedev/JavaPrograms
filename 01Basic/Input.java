import java.util.Scanner;
class Input
{
 public static void main(String[] args)
 {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the number to print: ");
    int num = ob.nextInt();
    System.out.println("the number is "+num);
    ob.close();
 }   
}
