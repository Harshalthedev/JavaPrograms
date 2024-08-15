public class leetArr06 {
    public static void main(String[] args) {

        int[][]  mat = {
                    //    {1,2,3},
                    //    {4,5,6},
                    //    {7,8,9}
                    {7,3,1,9},
                    {3,4,6,9},
                    {6,9,6,6},
                    {9,5,8,5}
        } ;
        int sum = 0 ;
        int i = 0 , n = mat.length ;
        while ( i != n ) {

            sum = sum + mat[i][i] ;
            i++ ;
        }

        i = 0 ;
        int j = n-1 ;

        while ( j != -1 ) {

            sum = sum + mat[i][j] ;
            i++ ;
            j-- ;
        }
        if (mat.length % 2 != 0) {
            sum = sum - mat[ n / 2][ n / 2] ;
        }

        System.out.println(sum);
    }
}
