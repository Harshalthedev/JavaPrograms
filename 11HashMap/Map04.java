import java.util.HashMap;

class Hello {
    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;
        for (int i = 0; i < str.length; i++) {
            char ch = pattern.charAt(i);
                if (map.containsKey(ch) && !map.get(ch).equals(str[i])) return false;
                else if (map.containsValue(str[i]) && !map.containsKey(ch)) return false; 
                else  map.put(ch, str[i]);
        }
        
        return true;
    }

}