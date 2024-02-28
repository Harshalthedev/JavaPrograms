public class hackerr04 {
    public static void main(String[] args) {
        int[][] arr = {
            {11,2,4},
            {4,5,6},
            {10,8,-12}
        };
        int a = 0;
        int  b= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i == j) {
                    a = a + arr[i][j];
                }
            }
        }
        for (int k = arr.length-1; k >= 0; k--) {
            b = b +arr[k][arr.length-1-k];
        }
        int c = a-b;
        System.out.println(Math.abs(c));
    }
}
      