// using the range 
public class LinearSearch05 {
    public static void main(String[] args) {
       int[] arr = {25,36,45,12,85,96};
    //    int index;
       System.out.println(search(85,arr,1,5));

    }
    static int search(int target, int[] arr,int start,int end) {
        for(int i =start;i<=end;i++)
        {
            if(arr.length==0)
            {
                return -1;
            }
            if(target==arr[i])
            {
            int index = i;
            return index;
            } 
        }
        return -1; 
    }
}
