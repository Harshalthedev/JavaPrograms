
public class Merge {
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
//         int n = arr.length;
//         int l = 0;
//         int h = n-1;
//         int mid = (l +(h-l))/2;
//         Divide(arr,l,mid);
//     }
//     public static int Divide(int[] arr, int l,int h) {
// return 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
