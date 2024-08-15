public class Program16 {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        String word1Sum = "" ;
        String word2Sum = "" ;
        
        for ( int i = 0 ; i < word1.length ; i++ ) {
            word1Sum = word1Sum.concat(word1[i]) ;
        }
        
        for ( int i = 0 ; i < word2.length ; i++ ) {
            word2Sum = word2Sum.concat(word2[i]) ;
        }



        if( word1Sum.equals(word2Sum)) {
            System.out.println(true);
            return ;
        }

        System.out.println(false);
    }
}
