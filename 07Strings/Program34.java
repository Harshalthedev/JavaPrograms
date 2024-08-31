public class Program34 {
    public static void main(String[] args) {
        // String sentence = "i love eating burger";
        // String searchWord = "burg";
        String sentence = "this problem is an easy problem";
        String searchWord = "har";
        
        String[] s = sentence.split(" ");
        
        for (int i = 0; i < s.length; i++) {
         System.out.println(s[i]);   
            if ( s[i].length() >= searchWord.length() && s[i].substring(0, searchWord.length()).equals(searchWord)) {
                    System.out.println(i+1);;
                    return;             
            }
        }
        System.out.println("-1");
    }
}
