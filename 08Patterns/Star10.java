public class Star10 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i <= n; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k >=i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//    * 
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *