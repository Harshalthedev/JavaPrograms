import java.util.ArrayList;
import java.util.List;

public class leetArr143 {
    public static void main(String[] args) {
        System.out.println(countHillValley(new int[] {2,4,1,1,6,5}));
    }
    public static int countHillValley(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) list.add(nums[i]);
        }
        int hill = 0;
        int valley = 0;
        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i-1) < list.get(i) && list.get(i) > list.get(i+1)) hill++;
            if (list.get(i-1) > list.get(i) && list.get(i) < list.get(i+1)) valley++;
        }
        return hill+valley;
    }
}
