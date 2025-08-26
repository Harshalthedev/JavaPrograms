import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class leetArr157 {
    public static void main(String[] args) {
        List<List<Integer>> li = findSubsequences(new int[]{4,6,7,7});
        System.out.println(li);        
    }
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subsequences(res, new ArrayList<>(), nums, 0);

        return res;
    }
    public static void subsequences(List<List<Integer>> res, List<Integer> ds, int[] nums, int start) {
        if (checkSort(ds) && checkUnique(ds)) res.add(new ArrayList<>(ds));

        for (int i = start; i < nums.length; i++) {
            ds.add(nums[i]);
            subsequences(res, ds, nums, i+1);
            ds.remove(ds.size()-1);
        }
    }
    public static boolean checkSort(List<Integer> ds) {
        int n = ds.size();
        if (n < 2) return false;
        for (int i = 1; i < n; i++) {
            if (ds.get(i-1) > ds.get(i)) return false;
        }
        return true;
    }
    private static Set<List<Integer>> set = new HashSet<>();
    public static boolean checkUnique(List<Integer> ds) {
        if (set.contains(ds)) 
            return false;
        else 
            set.add(new ArrayList<>(ds));
        return true;
    }
}
