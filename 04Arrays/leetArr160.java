import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetArr160 {
    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[] {
        "900 google.mail.com", 
        "50 yahoo.com", "1 intel.mail.com",
        "5 wiki.org"
    }));//["9001 discuss.leetcode.com","9001 leetcode.com","9001 com"]
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains) {
                String[] str = s.split(" ");

            int num = Integer.parseInt(str[0]);
            String[] str2 = str[1].split("\\.");

            String s1 = str2[str2.length-1];
            map.put(s1, map.getOrDefault(s1, 0)+ num);

            String s2 = str2[str2.length-2].concat(".").concat(s1);
            map.put(s2, map.getOrDefault(s2, 0)+ num);

            if (str2.length == 3) {
                String s3 = str2[0].concat(".").concat(s2).concat(".").concat(s1);
                map.put(s3, map.getOrDefault(s3, 0)+ num);
            }
        }
        List<String> res = new ArrayList<>();
        for (String key : map.keySet()) {
            String domain = key;
            int cnt = map.get(key);
            res.add(Integer.toString(cnt)+" "+ domain);
        }
        return res;
    }
}
