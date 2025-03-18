import java.util.ArrayList;
import java.util.List;

public class leetArr71 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[] {0,1,2,4,5,7}));
        System.out.println(summaryRanges(new int[] {0,2,3,4,6,7}));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]+1) {
                if (start == nums[i-1]) {
                    list.add(String.valueOf(start));
                }
                else {
                    list.add(start+"->"+nums[i-1]);
                }
                start = nums[i];
            }
        }
        if (start == nums[nums.length-1]) {
            list.add(String.valueOf(start));
        }
        else {
            list.add(start+"->"+nums[nums.length-1]);
        }
        return list;
    }
}
