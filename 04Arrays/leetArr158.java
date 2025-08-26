import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetArr158 {
    public static void main(String[] args) {
        int cnt = totalNumbers(new int[] {6,6,6});
        System.out.println(cnt);
    }
    static int cnt = 0;
    public static int totalNumbers(int[] digits) {

        permutations(new ArrayList<>(), new boolean[digits.length], digits);
        return cnt;
    }
    private static void permutations(List<Integer> ds, boolean[] freq, int[] nums) {
        if (ds.size() == 3) {
            if (checkEvenANDUniq(ds)) cnt++;
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permutations(ds, freq, nums);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    static Set<List<Integer>> set = new HashSet<>();
    public static boolean checkEvenANDUniq(List<Integer> li) {
        if (li.get(0) == 0) return false;
        int num = 0;
        for (int i : li) {
            num = (num * 10) + i;
        }
        if (num % 2 != 0) return false;
        if (set.contains(li)) 
            return false;
        else 
            set.add(new ArrayList<>(li));
        return true;
    }
}
