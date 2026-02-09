public class leetArr176 {
    public static void main(String[] args) {
        // System.out.println(numEnclaves(new int[][] {
        //                                         {0,1,1,0},
        //                                         {0,0,1,0},
        //                                         {0,0,1,0},
        //                                         {0,0,0,0}
        //                                     }));

        // System.out.println(numEnclaves(new int[][] {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}}));

        // System.out.println(numEnclaves(new int[][] {{0},{1},{1},{0},{0}}));
        System.out.println(numEnclaves(new int[][] {{0,1,1,0,0}}));
}

    private static int n;
    private static int m;
    public static int numEnclaves(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        //fist row
        for (int i = 0; i < m; i++) {
            if (grid[0][i] == 1) {
                convertLand(grid, 0, i);
            }
        }
        //last row
        for (int i = 0; i < m; i++) {
            if (grid[n-1][i] == 1) {
                convertLand(grid, n-1, i);
            }
        }
        //first col
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                convertColLand(grid, i, 0);
            }
        }
        //last col
        for (int i = 0; i < n; i++) {
            if (grid[i][m-1] == 1) {
                convertColLand(grid, i, m-1);
            }
        }

        //count land
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) cnt++;
            }
        }

        return cnt;
    }
    public static void convertLand(int[][] grid, int i, int j) {
        if (i >= m || j >= n || i < 0 || j < 0) return;
        if (grid[i][j] == 0) return;
        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            // return;
        }
        convertLand(grid, i+1, j);
        convertLand(grid, i, j+1);
        convertLand(grid, i-1, j);
        convertLand(grid, i, j-1);
    }
    public static void convertColLand(int[][] grid, int j, int i) {
        if (i >= m || j >= n || i < 0 || j < 0) return;
        if (grid[j][i] == 0) return;
        if (grid[j][i] == 1) {
            grid[j][i] = 0;
        }
        convertColLand(grid, j+1, i);
        convertColLand(grid, j, i+1);
        convertColLand(grid, j-1, i);
        convertColLand(grid, j, i-1);
    }
}
