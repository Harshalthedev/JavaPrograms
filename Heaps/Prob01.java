public class Prob01 {
    public static void main(String[] args) {
        int[][] grid = { {1,2,4},
        {3,3,1}
      };
        System.out.println(deleteGreatestValue(grid));
    }
    public static int deleteGreatestValue(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int sum = 0;
        for ( int i = 0; i < cols; i++) {
            int maxRow = 0;
            for ( int j = 0; j < rows; j++) {
                int max = -1, l = -1, m = -1;
                for ( int k = 0; k < cols; k++) {
                    if ( max < grid[j][k]) {
                        max = grid[j][k]; 
                        l = j; m = k;
                    }
                }
                grid[l][m] = -1;
                maxRow = Math.max(maxRow, max);
            }
            sum += maxRow;
        }
        return sum;
    }
}
