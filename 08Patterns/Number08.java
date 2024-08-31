public class Number08 {
    public static void main(String[] args) {
        int n = 5;
        int temp =0;
        for (int i = 0; i < n; i++) {
            for (int j = n-2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                
                System.out.print(j+1);
            }
            temp = i;
            for (int j = 0; j < i; j++) {

                if(i > 0) {
                    System.out.print(temp);
                }
                temp--;
            }
            System.out.println();
        }
    }
}
//     1
//    121
//   12321
//  1234321
// 123454321