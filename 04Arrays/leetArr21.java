public class leetArr21 {
    public static void main(String[] args) {
        // int[] arr = {1,4,2,5,3};  //58
        // int[] arr =  {1,2};  //3
        int[] arr = {10,11,12}; //66

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(arr.length % 2 != 0) {
            sum = 2 * sum ;
            for (int i = 0; i < arr.length-2 ; i++) {
               for (int j = i; j <= 2+i; j++) {
                sum += arr[j];
               } 
            }
        }

        System.out.println(sum);
    }
}
