import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class ArrayList04 {
    public static void main(String[] args) {
        
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for ( String word : strs ) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if (!map.containsKey(sorted) ) {
                map.put(sorted , new ArrayList<>());
            }
            map.get(sorted).add(word);
        } 
        ArrayList<ArrayList<String>> list = new ArrayList<>(map.values());
        System.out.println(list);
        
    }
}
