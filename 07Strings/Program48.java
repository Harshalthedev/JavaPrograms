import java.util.ArrayList;
import java.util.List;

public class Program48 {
    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2(46));
    }
    public static boolean reorderedPowerOf2(int n) {
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        for (char ch : s.toCharArray()) if (ch == '1') cnt++;
        if (cnt == 1) return true;
        List<List<String>> result = new ArrayList<>();
        subset(result, new ArrayList<>(), Integer.toString(n), 0);
        System.out.println(result);
        for (List<String> res : result) {
            for (String str : res) {
                if (str.charAt(0) != '0' && str.length() == s.length()) {
                    String st = Integer.toBinaryString(Integer.parseInt(str));
                    int c = 0;
                    for (char ch : st.toCharArray()) if (ch == '1') c++;
                    if (c == 1) return true;
                }
            }
        }
        return false;
    }
    public static void subset(List<List<String>> result, List<String> temp, String num, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < num.length(); i++) {
            temp.add(Character.toString(num.charAt(i)));
            subset(result, temp, num, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
