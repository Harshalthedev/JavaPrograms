import java.util.Arrays;

public class leetArr171 {
    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[] {1,4,5}, 1, 2));
        System.out.println(maxFrequency(new int[] {5,11,20,20}, 5, 1));
        System.out.println(maxFrequency(new int[] {1,3,8,12}, 2, 2));
        System.out.println(maxFrequency(new int[] {1, 90}, 76, 1));
    }
    public static int maxFrequency(int[] nums, int k, int numOperations) {
        int n = nums.length;
        Arrays.sort(nums); 
        int[][] rangeOverlap = new int[n][2];
        for (int i = 0; i < n; i++) {
            rangeOverlap[i][0] = nums[i] - k;
            rangeOverlap[i][1] = nums[i] + k;
        }
        int maxFreq = 0;
        int same = 0;
        int ovrlap = 1;
        for (int i = 0; i < n-1; i++) {
            if (rangeOverlap[i][1] >= rangeOverlap[i+1][0] && rangeOverlap[i][1] <= rangeOverlap[i+1][1]) {
                if (nums[i] == nums[i+1]) same++;
                else ovrlap++;
            }
            else {
                ovrlap = 1;
                same = 0;
            }
            ovrlap = ovrlap > numOperations+1 ? numOperations : ovrlap;
            maxFreq = Math.max(maxFreq, same + ovrlap);
        }
        return maxFreq;
    }
}
