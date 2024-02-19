import java.util.Scanner;
public class Solution04 {
    public static void main(String[ ]args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int large = arr[0];
        int in;
        for(int j=0;j<arr.length;j++)
        {
            if(large<arr[j])
            {
                large = arr[j];
                System.out.println("big digit "+large);
                in = j;
                System.out.println("index "+in); 
            }
        }
        sc.close();
    }
    
}
