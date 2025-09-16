public class leetArr168 {
    public static void main(String[] args) {
        System.out.println(tarSubSize(new int[] {2, 4, 6, 10}, 16, 2));    
    }
    public static boolean tarSubSize(int[] nums, int target, int size) {
        int sum = 0;
        if (size > nums.length) return false;
        for (int r = 0; r < size; r++) {
            sum += nums[r];
        }
        if (sum == target) return true;
        for (int l = 0, r = size; r < nums.length; l++, r++) {
            sum = sum - nums[l] + nums[r];
            if (sum == target) return true;
        }
        return sum == target;
    }

}
