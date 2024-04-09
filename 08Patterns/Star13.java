public class Star13 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int l = n-1;
        for (int j1 = 0; j1 < l; j1++) {
            for (int j2 = l; j2 > j1 ; j2--) {
                System.out.print("* ");
            }
             System.out.println();
        }
    }
}
// * 
// * * 
// * * * 
// * * * *
// * * *
// * *
// *