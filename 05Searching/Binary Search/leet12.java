// public class leet12 {
//     public static void main(String[] args) {
//         char[][] board = {
//             {'A','B','C','E'},
//             {'S','F','C','S'},
//             {'A','D','E','E'}
//         };
//         String word = "ABCCED";
//         System.out.println(find(board, word));
//     }
//     static boolean find(char[][] board,String word) {

    
//         char[] arr = word.toCharArray();
//         char[] temp01 = new char[arr.length];
//         for(int i=0;i<board.length;i++) {
//             for(int k =0 ;k<arr.length;k++) {
//                 char target = arr[k];
//                 for(int j=0;j<board[i].length;j++) {
//                     if(target == board[i][j]) {
//                         temp01[k] = target;
//                     }
//                 }
//             }
//         }
//         String str = String.valueOf(temp01);
//         if(word == str){
//             return true;
//         }
//         return false;
//     }
// }
public class leet12 {
    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(find(board, word));
    }
    
    static boolean find(char[][] board, String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, arr, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = ' '; // Mark the cell as visited
        boolean found = dfs(board, word, i + 1, j, k + 1) ||
                        dfs(board, word, i - 1, j, k + 1) ||
                        dfs(board, word, i, j + 1, k + 1) ||
                        dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp; // Restore the cell
        return found;
    }
}
