import java.util.*;

public class leetArr102 {
    public static void main(String[] args) {
        List<Integer> res = findKDistantIndices(new int[] {3,4,9,1,3,9,5}, 9, 1);
        System.out.println(res);
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        for(int j : list) {
            int s = Math.max(0, j-k);
            int e = Math.min(n-1, j+k);
            while (s <= e) {
                set.add(s);
                s++;
            }
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);

        return res;
    }
}
