public class Prog_4 {
    public static void main(String[] args)
    {
        int[] arr ={2,6,8,14,16,19,27,37,39};
        int target = 2;
        int l = 0;
        int h = arr.length-1;
        binary(arr,target,h,l);
    }
    static void binary(int[] arr,int target,int h,int l)
       {
            for(int mid = (h+l)/2;l<=h;mid = (h+l)/2)
              {
                 if(arr[mid]==target)
                  {
                      System.out.println("target element "+target+" found at index "+mid);
                      return;
                  }
                  else 
                  if(target>arr[mid])
                  {
                      l = mid+1;
                  }
                 else
                 {
                    h = mid -1;
                 }
             }
         }
  
}
