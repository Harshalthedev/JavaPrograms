import java.util.Arrays;

public class leetArr68 {
    public static void main(String[] args) {
        System.out.println(minZeroArray(new int[] {4,3,2,1}));
        System.out.println(minZeroArray(new int[] {3,6,1,0}));
    }
    public static int minZeroArray(int[] nums) {
        int largeEle = Integer.MIN_VALUE;
        int x = Integer.MIN_VALUE;
        int n = nums.length;
        int maxIndex = -1   ;
        for (int i = 0; i < n; i++) {
            if ( largeEle < nums[i]) {
                x = largeEle;
                largeEle = nums[i];
                maxIndex = i;
            }
            else if (x < nums[i]) {
                x = nums[i];
            }
        }
        return  x*2 <= largeEle ? maxIndex : -1;
    }
}
