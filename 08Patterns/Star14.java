public class Star14 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = n-2; j >= i; j--) {
                System.out.print(" ");
            } 
            for (int k = 0; k <= i; k++) {
                if(i > 0 && i < n-1 && k > 0 && k < i) {
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
//      * 
//     * * 
//    *   * 
//   *     *
//  *       *
// * * * * * *