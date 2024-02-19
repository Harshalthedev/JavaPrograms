// import java.util.Arrays;

class Swaping
{
    public static void main(String[] args)
    {
        int[] arr = {1,8,96,87,10};
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        swap(arr,1,4);
        // reverse(arr);
        //     System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");  
        }
    }
    // static void reverse(int[] arr)
    // {
    //     for (int i=(arr.length-1);i>=0;i--)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
}
