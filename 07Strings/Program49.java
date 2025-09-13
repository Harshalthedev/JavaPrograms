import java.util.*;

public class Program49 {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEecOde"));
    }
    public static String sortVowels(String s) {
        List<Character> vovels = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if(checkVovel(ch)) {
                vovels.add(ch);
            }
        }
        Collections.sort(vovels);
        StringBuilder sb = new StringBuilder(s);
        int vCnt = 0;

        for (int i = 0; i < sb.length(); i++) {
            char ch = s.charAt(i);
            if(checkVovel(ch)) {
                sb.setCharAt(i, vovels.get(vCnt++));
            }
        }

        return sb.toString();
    }
    public static boolean checkVovel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' ||
        ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' ||
        ch == 'i' || ch == 'o' || ch == 'u';
    }
}
