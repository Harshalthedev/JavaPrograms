public class leetArr110 {
    public static void main(String[] args) {
        // System.out.println(minimumCost(new int[] {1,1,2}));
        // System.out.println(minimumCost(new int[] {1,2,3,12}));
        System.out.println(minimumCost(new int[] {1,1,1}));
    }
    public static int minimumCost(int[] nums) {
        int a = nums[0];
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        // int c = nums[1];
        for (int i = 1; i < nums.length; i++) {
            if (b > nums[i]) {
                c = b;
                b = nums[i];
            }
            else if(nums[i] < c) {
                c = nums[i];
            }
        }
        return a+b+c;
    }
}
