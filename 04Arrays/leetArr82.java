public class leetArr82 {
    public static void main(String[] args) {
        // int[] nums = {3,4,-1,1};
        // int[] nums = {7,8,9,11,12};
        int[] nums = {5,4,1,2,3};
        int n = nums.length;
        for ( int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i]-1]) {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(n+1);
    }
}
