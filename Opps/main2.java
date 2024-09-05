public class main2 {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2},
            {3,4}
        };
        int r =1 , c = 4;
        int mat_rows = mat.length;
        int mat_cols = mat[0].length;
        if ((mat_rows*mat_cols) != (r*c)) return mat;
        int[][] arr = new int[r][c];
        int r1 = 0;
        int c1 =0;        
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                arr[i][j] = mat[r1][c1];
                c1++;
                if ( c1 == mat_cols) {
                    c1 = 0;
                    r1++;
                }
            }
        }

        for ( int i = 0 ; i < r ; i++ ) {
            // c1 = 0 ;
            for ( int j = 0 ; j < c ; j++ ) {
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
