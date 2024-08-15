public class Program17 {
    public static void main(String[] args) {
        String[] str = {"a","abc","bc","d"} ;
        String word = "abc" ;
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (word.indexOf(str[i]) > -1 ) {
                count++ ;

            }
            if(word.equals(str[i])) {
                count--;
            }
        }
        System.out.println(count);
    }
}
