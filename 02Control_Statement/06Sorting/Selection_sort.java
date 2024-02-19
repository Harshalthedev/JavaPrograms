// public class Selection_sort {
//     public static void main(String[] args)
//     {
//         int arr[] = {65,99,25,26,38,78,96,41,93,19,95,42};
//         // int min = arr[0];
//         // int index =0;
//         // for(int i=0;i<arr.length-1;i++)
//         // {
//         //     if(min>arr[i])
//         //     {
//         //         min = arr[i];
//         //         index = i;
//         //     }
//         // }
//         // System.out.println("the element is "+min+" at index "+index);
//         // arr[index] = arr[0];
//         // arr[0] = min;
//         // for (int i = 0; i < arr.length-1; i++) {
//         //     System.out.print(arr[i]+" ");
//         // }
//         for (int k = 0; k < arr.length-2; k++) {
//             int small = arr[k];
//             // int in = 0;
//             for (int l = k+1; l < arr.length-1; l++) {
//                 if(small>arr[l])
//                 {
//                     small = arr[l];
//                     // in =l;
//                 }
//                 int temp = small;
//                 small = arr[k];
//                 arr[k] = temp;
//             }
//         }
//         for (int j = 0; j < arr.length-1; j++) {
//             System.out.println(arr[j]+" ");
//         }
//     }
// }
public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
        
    }


    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}