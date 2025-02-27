import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map07 {
    public static void main(String[] args) {
        // System.out.println(commonChars(new String[] {"bella","label","roller"}));
        System.out.println(commonChars(new String[] {"cool"}));
    }
    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        if (words.length == 1) {
            for (char ch : words[0].toCharArray()) {
                list.add(String.valueOf(ch));  // Convert char to String and add to list
            }
            return list;
        }
        HashMap<String, Integer>[] arrMap = new HashMap[words.length-1];
        for ( int i = 1; i < words.length; i++) {
            arrMap[i-1] = new HashMap<>();
            for ( String ch : words[i].split("")) {
                arrMap[i-1].put(ch, arrMap[i-1].getOrDefault(ch, 0)+1);
            }
        }
        for (int i = 0; i < arrMap.length; i++) {
            System.out.println(arrMap[i]);
        }
        for ( String ch : words[0].split("")) {
            boolean res = false;
            for (HashMap<String,Integer> hashMap : arrMap) {
                res = true;
                if (hashMap.containsKey(ch) && hashMap.get(ch) > 0) {
                    hashMap.put(ch, hashMap.get(ch)-1);
                }
                else {
                    res = false;
                    break;
                }
            }
            if(res) list.add(ch);
        }
        return list;
    } 
}
