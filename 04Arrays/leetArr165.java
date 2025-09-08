public class leetArr165 {
    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }
  
    public static int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j, m, n);
                }
            }
        }
        return -1;
    }
    private static int dfs(int[][] grid, int i, int j, int m, int n) {
        if (i >= m || i < 0 || j < 0 || j >= n || grid[i][j] == 0) return 1;
         
        if (grid[i][j] == -1) return 0;
        grid[i][j] = -1;

        return dfs(grid, i+1, j, m, n)
        + dfs(grid, i-1, j, m, n)
        + dfs(grid, i, j+1, m, n)
        + dfs(grid, i, j-1, m, n);
    }
}
