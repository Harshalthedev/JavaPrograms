/*find the even number of digits */
public class LinearSearch03
{
    public static void main(String[] args)
    {
        int [] arr={112,2224,678,89,157,-25,-8575};
        Search(arr); 
    }

    static void Search(int[] arr)
        {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr[i] *= -1;
            }

            int element = arr[i];
            String num = Integer.toString(arr[i]);
            int even = num.length() ;
            if(even % 2 == 0)
            {
                System.out.print(element+" ");
            }  
        }
    }
}