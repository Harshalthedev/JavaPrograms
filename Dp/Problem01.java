import java.util.Arrays;

public class Problem01 {
    public static void main(String[] args) {
        // System.out.println(maxTotal(new int[] {5,1,4}, "001"));
        Problem01 obj = new Problem01();
        // System.out.println(obj.maxTotal(new int[] {5,1,4}, "001"));
        // System.out.println(obj.maxTotal(new int[] {61}, "1"));
        System.out.println(obj.maxTotal(new int[] {11,11,14,10}, "1011"));
    }
    public  long maxTotal(int[] nums, String s) {
        int n = s.length();
        long ans = 0l;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = i;
            dp[i][1] = s.charAt(i) == '1' ? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '0') continue;
            if (dp[i-1][1] == 0 && nums[i-1] > nums[i]) {
                dp[i-1][1] = 1;
                dp[i][1] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (dp[i][1] == 1) ans += (long) nums[i];
        }
        return ans;
    }
}