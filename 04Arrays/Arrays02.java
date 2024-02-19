
class Arrays02
{
    public static void main(String[] args)
    {
        int i=0,largest,smallest;
        int arr[] = {25,59,54,76 ,36,42,9,2,48};
        largest = arr[0];
        smallest = arr[0];
        while(i<arr.length)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }
            if(smallest> arr[i])
            {
                smallest = arr[i];
            }
            i++;
        }
        System.out.println("the largest number is "+largest);
        System.out.println("the smallest number is "+smallest);
    }
}
