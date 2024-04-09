public class Number06 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j > 0 && j < i) {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 4 4 1
// 1 5 5 5 5 1