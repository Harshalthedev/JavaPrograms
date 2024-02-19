public class LinearSearch01
{
    public static void main(String[] agrs)
    {
        int[] arr = {15,25,63,87,96,49,13};
        int target = 449;
        linearSearch(arr,target);
        // System.out.println(ans);
    }

    static void linearSearch(int[] arr, int target)
    {
        if(arr.length==0){
            System.out.println("empty");
    
        }
        for(int i =0;i<arr.length;i++)
        {
            int element = arr[i];
            if(target==element)
            {
                System.out.println("index= "+i);
                System.out.println(element);
            }
            else {
            System.out.println("no. dont exixts");
            }
        }
        
    }
    
}
