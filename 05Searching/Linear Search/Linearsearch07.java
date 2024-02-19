public class Linearsearch07 {
    public static void main(String[] args)
    {
        int[][] arr = {
            {25,65,45},
            {87,86,34,12},
            {31,24,16,10}
            };
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int min(int[][] arr)
    {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(min>arr[i][j]) 
                {
                    min = arr[i][j];
                }   
            }    
        }
        return min;
    }
}
