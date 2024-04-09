public class Number01 {
    public static void main(String[] args) {
        int count =0;
        int n =4;
        for (int i = 0; i < n; i++) {   
            for (int j = 0; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
// 0 
// 1 2
// 3 4 5
// 6 7 8 9