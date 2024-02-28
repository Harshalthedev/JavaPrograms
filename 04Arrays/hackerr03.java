public class hackerr03 {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5};
        int size = arr.length;
        long sum =0;
        long result1 =0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
       
        for (int j = 0; j < size ; j++) {
            result1 = sum - arr[j];
            arr[j] = result1;
            result1 =0;
        }
        

        long max = arr[0];
        long min = arr[0];
        for (int k = 0; k < size; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
        
    }
}

