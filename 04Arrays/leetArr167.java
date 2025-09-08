public class leetArr167 {
    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(new int[][] {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}
        }));    
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j, m, n));
                }
            }
        }
        return maxArea;
    }
    public static int dfs(int[][] grid, int i, int j, int m, int n) {
        if (i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == 0) return 0;
        if (grid[i][j] == -1) return 0;
        grid[i][j] = -1;

        return 1
        + dfs(grid, i+1, j ,m , n)
        + dfs(grid, i-1, j ,m , n)
        + dfs(grid, i, j+1 ,m , n)
        + dfs(grid, i, j-1 ,m , n);
    }
}
