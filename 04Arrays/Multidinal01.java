
class Multidinal01
{
    public static void main(String[] args)
    {
        /* 1 2 3
           4 5 6 
           7 8 9  */
    
        int arr[][]={
                        {1,2,3},           //0th index
                        {4,5,6},          //1st index
                        {7,8,9,64}         //2nd index
                    }; 
            // System.out.println(Arrays.toString(arr[0]));
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
