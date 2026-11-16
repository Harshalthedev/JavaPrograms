import java.math.BigInteger;

public class Multidinal05 {
    public static void main(String[] args) {
        // int[][] grid = ConstructProductMatrix(new int[][] {{1,2},{3,4}});
        int[][] grid = ConstructProductMatrix(new int[][] {{12345}, {2}, {1}});
        // int[][] grid = ConstructProductMatrix(new int[][] {[[10,20],[18,16],[17,14],[16,9],[14,6],[16,5],[14,8],[20,13],[16,10],{14,17}});
        for (int[] arr : grid) {
            for (int is : arr) {
                System.out.print(is+" ");
            }
            System.out.println();
        }
    }
        public static int[][] ConstructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        BigInteger bgInt = BigInteger.ONE;
        BigInteger[] prefix = new BigInteger[n*m];
        prefix[0] = BigInteger.valueOf(grid[0][0]);
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) continue;
                prefix[k] = prefix[k-1].multiply(BigInteger.valueOf(grid[i][j]));
            }
        }
        BigInteger[] suffix = new BigInteger[n*m];
        suffix[(n*m)-1] = BigInteger.valueOf(grid[n-1][m-1]);
        long l = (n*m)-1;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if(i == n-1 && j == m-1) continue;
                suffix[l] = 
            }
        }
        for (int[] arr : grid) {
            for (int num : arr) {
                bgInt = bgInt.multiply(BigInteger.valueOf(num));
            }
        }
        long mod = 12345L;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                BigInteger bgnum = BigInteger.valueOf(grid[i][j]);
                BigInteger cal =  bgInt.modInverse(bgnum);
                grid[i][j] = cal.mod(BigInteger.valueOf(mod)).intValue();
            }
        }
        return grid;
    }
}