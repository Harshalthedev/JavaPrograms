public class pattern01 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if( i > 1 && k > 0 && k < i) {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println("harshal");
    }
}
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 4 4 1
// 1 5 5 5 5 1
