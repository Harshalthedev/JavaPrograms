import java.util.Arrays;
import java.util.Scanner;
public class Arrays04
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i= 0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        String[] nam = new String[5];
        for(int i=0;i<nam.length;i++ )
        {
            nam[i] = in.next();
            
        }
        System.out.println(Arrays.toString(nam));
        in.close();
    }
        
}
