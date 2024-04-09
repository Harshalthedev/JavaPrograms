public class leet13 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17},
        };
        int target = 5;
        System.out.println(search(matrix,target));
    }
    static boolean search(int[][] matrix,int target) {
        int row = matrix.length-1; 
        int col = matrix[0].length-1;
        int rows= 0;
        int cols =0;
        if (target > matrix[row][col]){
            return false;
        }
        while (row >= rows && col >= cols) {
            if(target == matrix[rows][cols]) {
                return true;
            }
            if (cols == col) {
                cols =0;
                rows++;
            }
            else {
                if(target > matrix[rows][cols]) {
                cols ++;
                }
                else {
                rows++;
                cols = 0;
                }
            }
        }
        return false;
    }
}
