class LinearSearch08
{
    public static void main(String[] args)
    {
        int[][] arr =
    {
        {2,0,8},
        {8,3,2},
        {7,2,6}
    };

    int ans  = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        int sum=0;
        for(int j=0;j<arr.length;j++)
        {
            sum= sum+arr[i][j];
        }
        if(ans<sum)
        {
            ans = sum;
        }
        System.out.println(ans);
        
    }
    }
}
