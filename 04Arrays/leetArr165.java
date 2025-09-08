public class leetArr165 {
    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }
    private static int peri = 0;
    private static int m;
    private static int n;
    public static int islandPerimeter(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return peri;
    }
    private static void dfs(int[][] grid, int i, int j) {
        if (i >= m || i < 0 || j < 0 || j >= n || grid[i][j] == 0) {
            peri++;
            return;
        } 
        if (grid[i][j] == -1) return;
        grid[i][j] = -1;

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
