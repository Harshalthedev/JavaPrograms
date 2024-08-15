public class Number09 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                if(i < n-2 && n-1 > j && j > i){
                    System.out.print("  ");
                }
                else {
                    System.out.print(i+1 +" ");
                }
            }
            System.out.println();
        }
        int x = n-1;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-2; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = -1; j <= i; j++) {
                if(i > 0 && j > -1 && j < i){
                    System.out.print("  ");
                }
                else {
                    System.out.print(x +" ");
                }
            }
            x--;
            System.out.println();
        }
    }
}
