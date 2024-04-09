public class Star11 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n-1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 4-2; i++) {
            for (int j = n-2; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//  * * * * 
//   * * *
//    * *
//     *
//    * *
//   * * *
//  * * * *