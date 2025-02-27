import java.util.Arrays;

public class leetArr55 {
    public static void main(String[] args) {
    //     System.out.println(largestSumAfterKNegations(new int[] {3,-1,0,2}, 3));
    //     System.out.println(largestSumAfterKNegations(new int[] {2,-3,-1,5,-4}, 2));
    //     System.out.println(largestSumAfterKNegations(new int[] {4,2,3}, 1));
        System.out.println(largestSumAfterKNegations(new int[] {-2,9,9,8,4}, 5));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int maxSum = 0;
        Arrays.sort(nums);
        int i = 0;
        //-1 0 2 3
        while ( i < nums.length) {
            if ( nums[i] <= 0 && k > 0) {
                if (nums[i] < 0) {
                    maxSum += -nums[i];
                    i++;
                } 
                k--;
            }
            else {
                if ( k > 0 && k %2 == 0) {
                    
                }
                else maxSum += nums[i];
                i++;
            }
        }
        return maxSum;
    }
}
