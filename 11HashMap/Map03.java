import java.util.HashMap;
import java.util.Set;

public class Map03 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        HashMap<Integer,Integer> map= new HashMap<>();
        for ( int i : nums ) {
            if ( map.containsKey(i) ) {
                map.put(i,map.get(i)+1 );
            }
            else {
                map.put(i,1);
            }
        }       
        Set<Integer> keys = map.keySet();

        int Max_Count = 0;
        int count = 0;

        for (int key : keys)  {
            Max_Count = Math.max(Max_Count, map.get(key));
        }
        for (int key : keys) {
            if (map.get(key) == Max_Count) {
                count += Max_Count;
            }
        }

        System.out.println(count);
    }
}
