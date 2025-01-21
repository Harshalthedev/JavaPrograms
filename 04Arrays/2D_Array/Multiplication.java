public class Multiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6}
        }; 
        int[][] arr2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] result = new int[3][3]; 
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                for (int j2 = 0; j2 < arr1[i].length; j2++) {
                    result[i][j] = arr1[i][j2] * arr2[i][j2];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
