import java.util.HashMap;
import java.util.Set;
public class Map02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,3,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            if ( map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> ob = map.keySet();

        for (Integer keys : ob) {
            System.out.println(keys+" "+map.get(keys));
        }

    }    
}
