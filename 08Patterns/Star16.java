public class Star16 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = n-1; j >= i; j--) {
                if (i > 0 && i < n-1 && j < (n-1)  && j > i ) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = n-2; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i+1; j++) {
                if (i > 0 && i < n-2 && j > 0 && j <= i) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
// * * * * 
//  *   *
//   * *
//    *
//   * *
//  *   *
// * * * *