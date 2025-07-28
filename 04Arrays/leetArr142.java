import java.util.*;

public class leetArr142 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));  // ⬅️ Add the current subset to the result
        System.out.println(result);
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);                      // Choose element nums[i]
            backtrack(result, tempList, nums, i + 1);    // Explore further with nums[i] included
            tempList.remove(tempList.size() - 1);  
            System.out.println(tempList);     // Backtrack: remove last element to try next possibility
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }
}
