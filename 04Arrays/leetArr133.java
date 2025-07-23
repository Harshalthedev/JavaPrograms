public class leetArr133 {
    public static void main(String[] args) {
        int[][] res = onesMinusZeros(new int[][] {
            {0,1,1},
            {1,0,1},
            {0,0,1}
        });
        for (int[] is : res) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesRow = new int[m];
        int[] zerosRow = new int[m];
        for (int i = 0; i < m; i++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) one++;
                else zero++;
            }
            onesRow[i] = one;
            zerosRow[i] = zero;
        }
        int[] onesCol = new int[n];
        int[] zerosCol = new int[n];
        for (int i = 0; i < n; i++) {
            int one = 0;
            int zero = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1) one++;
                else zero++;
            }
            onesCol[i] = one;
            zerosCol[i] = zero;
        }
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
 
            }
        }
        return diff;
    }
}
