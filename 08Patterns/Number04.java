public class Number04 {
    public static void main(String[] args) {
        int count =0;
        int n= 4;
        for (int i = 0; i < n; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
// 0123
// 456
// 78
// 9