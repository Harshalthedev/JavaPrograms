public class leet07 {
    public static void main(String[] args) {
        int[][] matrix = {
            {2,4,-1},
            {-10,5,11},
            {18,-7,6}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for(int i =0;i <rows; i++) {
            for(int j =0;j <cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
