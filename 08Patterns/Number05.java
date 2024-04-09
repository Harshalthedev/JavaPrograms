public class Number05 {
    public static void main(String[] args) {
        int n = 4;
        // int count =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // if (i % 2 == 0 && j == 0) {
                //     count = 1;
                // } 
                // else if (i % 2 == 1 && j == 0) {
                //     count = 0;
                // }

                // if (count == 1) {
                //     System.out.print(count);
                //     count = 0;
                
                // }
                // else {
                //     System.out.print(count);
                //     count = 1;
                // }
                if( (i+j) % 2 == 0 ) {
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
// 1
// 01
// 101
// 0101