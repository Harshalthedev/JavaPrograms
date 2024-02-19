import java.util.Arrays;

public class LinearSearch06
{
    public static void main(String[] args)
    {
        int[][] arr =  {
            {12,25,96,74},
            {63,74,24},
            {89,73,91,53,20}
        };
        int target =24;
        int[] ans  = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
        static int[] Search(int[][] arr, int target)
        {

            for (int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    if(arr[i][j]==target)
                    {
                        return new int[] {i,j} ; 
                    }       
                }
            }
            return new int[] {-1,-1};
        }
    
}