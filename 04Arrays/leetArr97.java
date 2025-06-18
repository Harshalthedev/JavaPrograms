import java.util.Arrays;

public class leetArr97 {
    public static void main(String[] args) {
        int[][] res = divideArray(new int[] {1,3,4,8,7,9,3,5,1}, 2);   
        for (int[] is : res) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        } 
    }
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res = new int[nums.length/3][3];
        int j = 0;
        for (int i = 2; i < nums.length; i += 3) {
            int diff = nums[i] - nums[i-2];
            if (diff <= k) {
                res[j][0] = nums[i-2];
                res[j][1] = nums[i-1];
                res[j][2] = nums[i];
                j++;
            }
        }
        return j != nums.length/3 ? new int[][] {} : res;
    }
}