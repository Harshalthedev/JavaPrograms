public class Number10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = n-2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(count++);
            }
            if ( i > 0) {
                count = i;
                for (int j = 0; j < i; j++) {
                    System.out.print(count--);
                }
            }
            System.out.println();
        }
    }
}
