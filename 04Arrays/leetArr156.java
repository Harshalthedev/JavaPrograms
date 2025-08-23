import java.util.ArrayList;
import java.util.List;

public class leetArr156 {
    public static void main(String[] args) {
        // Example usage of the class
        System.out.println("This is a placeholder for leetArr156 functionality.");

        System.out.println(minOperations(new int[]{5,2,3,1}));
    }
    public static int minOperations(int[] nums) {
        int n = nums.length;
        boolean sort = true;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] > nums[i]) {
                sort = false;
                break;
            }
        }
        if (sort) return 0;

        List<Integer> prevList = new ArrayList<>();
        for (int num : nums) prevList.add(num);

        int cnt = 0;
        while (!sort) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < prevList.size(); i++) {
                int sum = prevList.get(i-1) + prevList.get(i);
                if (min > sum) {
                    index = i;
                    min = sum;
                }
            }
            List<Integer> newList = new ArrayList<>();
            for ( int i = 0; i < prevList.size(); i++) {
                if (i == index-1) continue;
                if (i == index) {
                    newList.add(min);
                    continue;
                }
                newList.add(prevList.get(i));
            }
            sort = true;
            for (int i = 1; i < newList.size(); i++) {
                if (newList.get(i-1) > newList.get(i)) {
                    sort = false;
                    break;
                }
            }
            prevList = newList;
            cnt++;
        }
        return cnt;
    }
}