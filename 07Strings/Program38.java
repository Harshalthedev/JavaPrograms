import java.util.ArrayList;

public class Program38 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        // String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        ArrayList<String> list = new ArrayList<>();

        for ( int i = 0 ; i < words.length ; i++ ) {
            for ( int j = 0 ; j < words.length ; j++ ) {
                if ( i != j && words[i].indexOf(words[j]) >= 0 && !list.contains(words[j])) {
                    list.add(words[j]);
                }
            }
        }
        System.out.println(list) ;
    }
}
