public class Number03 {
    public static void main(String[] args) {
        int count = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 2; j >= i; j--) {
                System.out.print(" ");
            } 
            for (int k = 0; k <= i; k++) {
                System.out.print(count);
                count++;
            } 
            System.out.println();
        }
    }
}
//    0
//   12
//  345
// 6789