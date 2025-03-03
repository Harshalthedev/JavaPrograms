public class Multidimen04 {
    private static int[][] matrix;
    public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setZeroes(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        for ( int i = 0; i < rows; i++) {
            for ( int j = 0; j < cols; j++) {
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] nums = new int[rows][cols];
        for ( int i = 0; i < rows; i++) {
            for ( int j = 0; j < cols; j++) {
                nums[i][j] = matrix[i][j];
            }
        }
        for ( int i = 0; i < rows; i++) {
            for ( int j = 0; j < cols; j++) {
                if ( nums[i][j] == 0) {
                    for ( int k = 0; k < cols; k++) {
                        matrix[i][k] = 0;
                    }
                    for ( int k = 0; k < cols; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }
}
