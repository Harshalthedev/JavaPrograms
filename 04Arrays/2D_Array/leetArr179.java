public class leetArr179 {
    public static void main(String[] args) {
        int[] res = constructTransformedArray(new int[] {-1, 4 ,-1});
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for ( int i = 0; i < n; i++) {
            int rotate = (Math.abs(nums[i]) + i) % n;
            if (nums[i] > 0) {
                res[i] = nums[rotate];
            }
            else if (nums[i] < 0) {
                int c = rotate - i;
                int ans = i-c;
                ans = n - Math.abs(ans) % n; 
                res[i] = nums[ans];
            }
            else res[i] = nums[i];
        }
        return res;
    }
}
