public class leetArr115 {
    public static void main(String[] args) {
        System.out.println(findChampion(new int[][] {{0,0,1},{1,0,1},{0,0,0}}));
    }
    public static int findChampion(int[][] grid) {
        int n = grid.length;
        int maxPoint = 0;
        int team = 0;
        for (int i = 0; i < n; i++) {
            int cnt  = 0;
            for (int j = 0; j < n; j++) {
                if (i != n && grid[i][j] == 1) {
                    cnt++;
                }
            }
            if (maxPoint < cnt) {
                maxPoint = cnt;
                team = i;
            }
        }
        return team;
    }
}
