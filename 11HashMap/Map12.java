import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map12 {
    public static void main(String[] args) {
        List<String> result = findAndReplacePattern(new String[] {"abab","dddd","dede","yyxx"}, "baba");
        System.out.println(result);
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(String word : words) {
            int i = 0;
            boolean match = true;
            Map<Character, Character> map1 = new HashMap<>();
            Map<Character, Character> map2 = new HashMap<>();
            for (char ch : word.toCharArray()) {
                char pat = pattern.charAt(i);
                if (!map1.containsKey(pat) && !map2.containsKey(ch)) {
                    map1.put(pat, ch);
                    map2.put(ch, pat);
                    i++;
                }
                else if (map1.getOrDefault(pat, '0') == ch && map2.getOrDefault(ch, '0') == pat) {
                    i++;
                    continue;
                }
                else {
                    match = false;
                    break;
                }
            }
            if (match) list.add(word);
        }
        return list;
    }
}
