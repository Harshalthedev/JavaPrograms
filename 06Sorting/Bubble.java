public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[j] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        for (int k=0;k<n;k++) {
            System.out.print(arr[k]+" ");
        }
    }
}