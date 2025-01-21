import java.util.HashMap;
public class Program20 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1,1,0,1,0,0,1,0,1,1};
        int count = 0;
        int maxlen = 0;
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0 ; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;

            if ( !map.containsKey(count)) {
                map.put(count, i);
            }
            else {
                maxlen = Math.max(maxlen, i-map.get(count));
            }
        }
        System.out.println(maxlen);
    }
}
