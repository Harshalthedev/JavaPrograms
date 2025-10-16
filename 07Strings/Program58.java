import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Program58 {
    public static void main(String[] args) {
        String[] str = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                        "11", "12","13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
                        "23", "24", "25",  "26", "27", "28", "29", "30",  "31", "32", "33", "34",
                        "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47",
                        "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"};
        Map<String, Integer> map = new HashMap<>();
        String[] timePoints = {"23:59","00:00"};
        int n = 0;
        for (String s : str) {
            map.put(s, n);
            n++;
        }
        List<Integer> list = new ArrayList<>();
        for (String time : timePoints) {
            String[] s = time.split("\\:");
            int hr = map.get(s[0]);
            int min = map.get(s[1]);
            list.add(hr*60+min);
        }
        Collections.sort(list);
        int a = list.get(0)+1400;
        int b = list.get(list.size()-1);
        int min = Integer.MAX_VALUE;
        min = Math.min(min, Math.abs(a-b));
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, Math.abs(list.get(i-1) - list.get(i)));
        }
        System.out.println(min);
    }
}