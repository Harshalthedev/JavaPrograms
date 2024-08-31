import java.util.*;

class leetArr01 {
    public static void main(String[] args) {
        int[][] grid = {
            {9,1,7},
            {9,8,2},
            {3,4,6}
        };
        int[] arr = new int[2];
        int len = grid.length;
        int n = len*len;
        int[] arr1 = new int[n];
        int k=0;
        int sum2 = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                sum2 += grid[i][j];
                arr1[k++] = grid[i][j];
            }
        }
        System.out.println(sum2);
        Arrays.sort(arr1);
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] == arr1[i+1]) {
                arr[0] = arr1[i];
                break;
            }
        }
        arr[1] = sum1 - (sum2 - arr[0]);

        System.out.println(arr[0]+" "+arr[1]);
    }
}