public class Insertion_Sort {
    public static void main(String[] args)
    {
        int arr[] = {2,1,5,3,4};

        System.out.println("original array");
        printArray(arr);
        
        InsertionSort(arr);
        System.out.println("\nSorted array");
        printArray(arr);
    }
    static void InsertionSort(int[] arr)
    {
       for(int i = 0; i < arr.length-1; i++)
       {
           for (int j = i+1; j >0; j--) 
           {
               if(arr[j]<arr[j-1])
               {
                int temp = arr[j];
                arr[j]=  arr[j-1];
                arr[j-1] = temp;
               }
               else
               break;
           }
       } 
    }
    static void printArray(int[] arr)
    {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
