public class Number07 {
    public static void main(String[] args) {
        int n = 4;
        int count = 1; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }  
            int temp = count;
            for (int j = n-1; j >= i; j--) {

                System.out.print(count+" ");  
                count++; 
            }
            count = temp+1;
            System.out.println();
        }
        int count1 = 3;
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-2; j > i; j--) {
                System.out.print(" ");
            }
            temp = count1;
            for (int j = 0; j <= i+1; j++) {
                System.out.print(count1+" ");
                count1 ++;
            }
            count1 = temp - 1;
            System.out.println();
        }

    }
}

// 1 2 3 4
//  2 3 4 
//   3 4
//    4
//   3 4
//  2 3 4
// 1 2 3 4