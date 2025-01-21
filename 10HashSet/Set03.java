import java.util.HashMap;
import java.util.HashSet;

public class Prog03 {
    public static void main(String[] args) {
        int[] arr = {104,103,102,1,2,6,5,7,8,102};
        // int[] arr = {0,3,7,2,5,8,4,6,0,1};
        // int[] arr = {100,4,200,1,3,2};
        if ( arr.length == 0) return;
        HashSet<Integer > set = new HashSet<>();
        
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
        int curlen = 1;
        int maxlen = 0;
        for (int i : set) {
            int n = i;
            curlen = 1;
            if ( !set.contains(n-1))
            while (set.contains(n) && set.contains(n+1)) {
                curlen++;
                n++;
            }
            maxlen = Math.max(maxlen, curlen);
        }
        System.out.println(maxlen);










        // HashMap<Integer , Integer> map = new HashMap<>();

        // for (int i : arr) {
        //     map.put(i, map.getOrDefault(i , i+1));
        // }
        // System.out.println(map);
        // int len = 1;
        // int maxlen = 1;
        // for (int i : arr) {
        //     int n = i;
        //     len =1;
        //     while (map.containsKey(n) && map.containsKey(n+1)) {
        //         // if ( map.containsKey(n+1)) {
        //             len++;
        //             maxlen = Math.max(maxlen, len);
        //         // }
        //         n++;
        //     }
        // }
        // System.out.println(maxlen);
    }
}
