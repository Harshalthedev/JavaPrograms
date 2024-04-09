public class Number02 {
    public static void main(String[] args) {
        int count = 0;
        int n=4;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
// 0123
//  456
//   78
//    9