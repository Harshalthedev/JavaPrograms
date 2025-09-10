import java.util.Arrays;

public class leetArr166 {
    public static void main(String[] args) {
        int[][] res = floodFill(new int[][] {{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2);
        for (int[] is : res) {
            System.out.println(Arrays.toString(is));
        }
    }
    private static int[][] res;
    private static int m;
    private static int n;
    private static int srsc;
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;
        res = new int[m][n];
        srsc = image[sr][sc];
        dfs(image, sr, sc, color);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 0 && image[i][j] != Integer.MAX_VALUE) {
                    res[i][j] = image[i][j];
                }
            }
        }

        return res;
    }
    private static void dfs(int[][] image, int i, int j, int color) {
        if(i >= m || i < 0 || j >= n || j < 0 ) return;
        
        if (image[i][j] == Integer.MAX_VALUE || image[i][j] != srsc) return;
        res[i][j] = color;
        image[i][j] = Integer.MAX_VALUE;
        dfs(image, i+1, j, color);
        dfs(image, i-1, j, color);
        dfs(image, i, j+1, color);
        dfs(image, i, j-1, color);
    }
}
