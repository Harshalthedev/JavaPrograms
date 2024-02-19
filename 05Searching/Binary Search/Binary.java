
public class Binary 
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,9,10,12,15,18,19,25,26,27,29,59,69,99};
        int l=0;
        int h =arr.length-1;
        int target=69;
        
        // for(int mid = (l+h)/2 ; l<=h;mid = (l+h)/2)
        for (int mid = (l + h) / 2; l <= h; mid = (l + h) / 2) 
        {
            if(target == arr[mid])
            {
                System.out.println("the element "+target+"  is at index "+mid); 
                return;
            }
            else if (target>arr[mid]) {
                l = mid +1;
            }
            else {
                h = mid -1;
            }
        }
        System.out.println("the element "+target +" is not in the list");
    }
}
