public class Program13 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant" ;
        int k = 4 ;
        System.out.println(truncateSentence(s, k));
        
    }
    public static String truncateSentence(String s, int k) {
        String s1 = "" ;
        String[] str = s.split(" ") ;
        for (int i = 0; i < k; i++) {
            s1 = s1.concat(str[i]).concat(" ");
        }
           return s1.trim() ;

    }
}
