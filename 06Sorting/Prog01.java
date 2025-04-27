import java.util.Arrays;

public class Prog01 {
    public static void main(String[] args) {
        
        System.out.println(minIncrementForUnique(new int[] {3,2,1,2,1,7}));
    }
    final void india() {
        System.out.println("heelo");
    }
    public static int minIncrementForUnique(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                nums[i] = nums[i]+1;
                cnt++;
                i--;
            }
            Arrays.sort(nums, i, n-1);
            // System.out.println(cnt);
            // for (int num : nums) {
            //     System.out.print(num+" " );
            // }
            // System.out.println();
        }
        return cnt;
    }
}
