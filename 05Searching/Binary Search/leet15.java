public class leet15 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,5},
            {3,2,1}
        };
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0 | j == arr[i].length-1 ){
                    sum = sum + arr[i][j];
                }
                if(i == arr.length-1 | j == 0) {
                    sum2 = sum2 + arr[i][j];
                }
            }
        }
        if(sum > sum2) {
            System.out.println(sum2);
            }
            else {
                System.out.println(sum);
            }
    }
}
