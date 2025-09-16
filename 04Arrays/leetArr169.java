public class leetArr169 {
    public static void main(String[] args) {
        // Testcases
        String[][] grid1 = {
            {"0","E","0","0"},
            {"E","0","W","E"},
            {"0","E","0","0"}};
        // System.out.println("Test 1: " + killedEnemy(grid1) + " (expected 3)");

        Character[][] grid2 = {
            {'E', 'E', 'E', 'E', 'E'}, 
            {'W', '0', 'W', '0', 'W'}, 
            {'E', 'E', 'E', 'E', 'E'}}; 
        System.out.println("Test 2: " + killedEnemy(grid2) + " (expected 5)");
    }

    public static int killedEnemy(Character[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        int rowHits = 0;
        int[] colHits = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Recalculate rowHits if at first column or a wall is encountered
                if (j == 0 || grid[i][j - 1] == 'W') {
                    rowHits = 0;
                    for (int k = j; k < n && grid[i][k] != 'W'; k++) {
                        if (grid[i][k] == 'E') {
                            rowHits++;
                        }
                    }
                }

                // Recalculate colHits for the current column if at first row or a wall is encountered above
                if (i == 0 || grid[i - 1][j] == 'W') {
                    colHits[j] = 0;
                    for (int k = i; k < m && grid[k][j] != 'W'; k++) {
                        if (grid[k][j] == 'E') {
                            colHits[j]++;
                        }
                    }
                }

                // If the current cell is an empty spot, calculate total killed enemies
                if (grid[i][j] == '0') {
                    result = Math.max(result, rowHits + colHits[j]);
                }
            }
        }
        return result;
    }
}
