import java.util.Scanner;

public class BubbleSort {
    
    // Function to perform Bubble Sort and count swaps for ascending order
    public static int bubbleSortAsc(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        boolean swapped;
        
        // Bubble Sort for Ascending Order
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no two elements were swapped, array is sorted
        }
        return swapCount;
    }

    // Function to perform Bubble Sort and count swaps for descending order
    public static int bubbleSortDesc(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        boolean swapped;
        
        // Bubble Sort for Descending Order
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap adjacent elements if they are in wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no two elements were swapped, array is sorted
        }
        return swapCount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Create a copy of the original array to test both ascending and descending sorts
        int[] arrAsc = arr.clone();
        int[] arrDesc = arr.clone();
        
        // Calculate swap count for ascending and descending order
        int ascSwaps = bubbleSortAsc(arrAsc);
        int descSwaps = bubbleSortDesc(arrDesc);
        
        // Output the minimum of both swap counts
        System.out.println(Math.min(ascSwaps, descSwaps));
        
        sc.close();
    }
}
