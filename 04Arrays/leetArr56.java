public class leetArr56 {
    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[] {10,4,-8,7}));
    }
    public static int waysToSplitArray(int[] nums) {
        int leftSum = 0;
        int n = nums.length;
        int split = 0;
        for ( int i = 0; i < n-1; i++) {
            leftSum += nums[i];
            System.out.println(leftSum);
            int j = i+1;
            int rightSum = 0; 
            while ( j < n ) {
                rightSum += nums[j++];
            }
            System.out.println(rightSum);
            if (leftSum >= rightSum) split++;
        }
        return split;
    }
}
