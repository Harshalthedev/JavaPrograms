import java.util.ArrayList;
import java.util.List;

public class Prog02 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n subsets
        int xorTotal = 0;
        for (int i = 0; i < totalSubsets; i++) {
            int xor = 0;
            // System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    // System.out.print(nums[j] + " ");
                    xor ^= nums[j];
                }
            }
            xorTotal += xor;
        }
        System.out.println(xorTotal);
    }
}