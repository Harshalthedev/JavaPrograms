public class leetArr105 {
    public static void main(String[] args) {
        System.out.println(countServers(new int[][] 
        {
            {1,1,0,0},
            {0,0,1,0},
            {0,0,1,0},
            {0,0,0,1}
        }));
        System.out.println(countServers(new int[][] {{1,0},{0,1}}));
    }
    public static int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cntSvr = 0;
        boolean[] rows = new boolean[m];
        for (int i = 0; i < m; i++) {
            int server = 0;
            for(int j = 0; j < n; j++) {
                if (grid[i][j] == 1) server++;
            }
            if (server > 1) {
                cntSvr += server;
                rows[i] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            int server = 0;
            int svr = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1 && rows[j] == false) server++;
                if (grid[j][i] == 1) svr++;
            }
            if (svr > 1) cntSvr += server;
        }
        return cntSvr;
    }
}
