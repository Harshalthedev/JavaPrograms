import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetArr154 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(partitionLabels("eccbbbbdec"));
    }
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        List<Integer> list = new ArrayList<>();
        int l = 0;
        int n = s.length();
        while (l < n) {
            int r = map.get(s.charAt(l));
            int maxLen = r-l+1;
            int temp = l;
            while (l <= r) {
                r = Math.max(r, map.get(s.charAt(l)));
                maxLen = Math.max(maxLen, r-temp+1);
                l++;
            }
            list.add(maxLen);
        }
        return list;
    }
}
