public class leet01 {
    public static void main(String[] args)
    {
        int[] arr = {2,4,6,9,11,14,45,48,50,100,689,720,789,845,890};
        Binary(arr,19,0,arr.length-1);
    }
    static void Binary(int[] arr,int target,int l,int h)
    {
        if(target > arr[h]) {
            System.out.println("out of array");
        }
        else
            System.out.println("out of array");

        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(arr[mid] == target) {
                System.out.println(target+" found at index "+mid);
                return;
            }
            if(target > arr[mid]) {
                l = mid+1;
            }
            else {h = mid-1;}
        }
        System.out.println(arr[l]+" is the ceiling of "+target+" target element found at index "+l);
    }
}
