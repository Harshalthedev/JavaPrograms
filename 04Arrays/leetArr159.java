import java.util.HashSet;
import java.util.Set;
public class leetArr159 {
    public static void main(String[] args) {
        // System.out.println(isValidSudoku(new char[][]{
        //     {'5','3','.','.','7','.','.','.','.'},
        //     {'6','.','.','1','9','5','.','.','.'},
        //     {'.','9','8','.','.','.','.','6','.'},
        //     {'8','.','.','.','6','.','.','.','3'},
        //     {'4','.','.','8','.','3','.','.','1'},
        //     {'7','.','.','.','2','.','.','.','6'},
        //     {'.','6','.','.','.','.','2','8','.'},
        //     {'.','.','.','4','1','9','.','.','5'},
        //     {'.','.','.','.','8','.','.','7','9'}
        // }));//true
        System.out.println(isValidSudoku(new char[][]
        { 
            {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
            {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
            {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
            {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
            {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
            {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
            {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        }));//false
    }
    public static boolean isValidSudoku(char[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == '.') continue;

                // row
                for (int k = j + 1; k < 9; k++) {
                    if (grid[i][j] == grid[i][k]) return false;
                }
                // col
                for (int k = i + 1; k < 9; k++) {
                    if (grid[i][j] == grid[k][j]) return false;
                }
                // subBox (only when top-left of a 3×3 block)
                if (i % 3 == 0 && j % 3 == 0) {
                    if (!checkSubBox(grid, i, j)) return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSubBox(char[][] grid, int i, int j) {
        Set<Character> set = new HashSet<>();
        for (int i1 = i; i1 < i + 3; i1++) {
            for (int j1 = j; j1 < j + 3; j1++) {
                if (grid[i1][j1] == '.') continue;
                if (set.contains(grid[i1][j1])) return false;
                set.add(grid[i1][j1]);
            }
        }
        return true;
    }
}