public class Insertion {
    public static void main(String[] args) {
        int[] arr = {12,31,25,8,32,17};
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
