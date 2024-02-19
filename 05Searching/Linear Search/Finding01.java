public class Finding01
/*find the number present in the array
simple way to find a number
*/

{
    public static void main(String[] args)
    {
        int[] arr = {15,25,69,74,36,85,29};
        // int target = 85;
        int sum =0;
        for (int i=0;i<arr.length;i++) 
        {
            // if(target==arr[i])
            sum = sum+arr[i];
            // {
                System.out.println("yes present");
            // }   
        }       
    }
}