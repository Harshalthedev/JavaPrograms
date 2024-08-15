class pattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) {
            int count = i+1;
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = n-1; j >= i; j--) {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int count1 = n-i;
            if( i > 0) {
                for (int k = n-1; k > i; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(count1+++" ");
                }
                System.out.println();
            }
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