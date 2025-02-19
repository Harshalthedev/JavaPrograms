import java.util.Arrays;
import java.util.LinkedList;

public class Hello {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};


        arr = merge(arr);
        for ( int l : arr) {
            System.out.print(l+" ");
        }
    }
    public static int[]  merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[arr1.length+arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                arr[k++] = arr2[j++];
            }
            else {
                arr[k++] = arr1[i++];
            }
        }
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }        
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }
        return arr;
    }
}
