class leetArr01 {
    public static void main(String[] args) {
        int [][] coordinates = {
            {1,1},
            {2,2},
            {3,4},
            {4,4},
            {5,5},
            {7,7}};
        System.out.println(checkStraightLine(coordinates));
       
        }
        static boolean checkStraightLine(int[][] coordinates) { 
            int j = 0;

            for ( int i =0; i < coordinates.length; i++ ) {
                if ( coordinates[i][j] == coordinates[i][j+1] ) {
                    true;
                }
                else {
                }
            }
            return false;
    }
}
