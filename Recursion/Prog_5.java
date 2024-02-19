public class Prog_5 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,6,9,12,14,18};
        System.out.println(binary(arr, 19, 0, arr.length-1));

    }
    static int binary(int[] arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid = (s+e)/2;

        if(target == arr[mid])
        {
            return mid;
        }

        if(target > arr[mid])
        {
            return binary(arr,target,mid+1,e);
        }

        {
            return binary(arr,target,s,mid-1);
        }
    }
}
