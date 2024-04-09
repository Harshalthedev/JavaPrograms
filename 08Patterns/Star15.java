public class Star15 {
    public static void main(String[] args) {
        int n = 6;
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
    }
}
// * * * * * * 
//  *       * 
//   *     * 
//    *   * 
//     * * 
//      * 
