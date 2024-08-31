public class leetArr39 {
    public static void main(String[] args) {
        int[][] grid = {
                        {4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}
                    };
        
        int count = 0;

        for ( int i = 0 ; i < grid.length ; i++ ) {
            int n = grid[i].length;
            for ( int j = 0 ; j < n ; j++ ) {
                if ( grid[i][j] < 0) {
                    count += n - j;
                    break;
                }
            }
        }

        System.out.println(count);
    }
    
}
