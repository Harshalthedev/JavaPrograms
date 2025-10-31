import java.util.Arrays;

public class leetArr172 {
    public static void main(String[] args) {
        int[] arr = getSneakyNumbers(new int[] {0,1,0,1});
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        boolean foundA = false;
        boolean foundB = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                if (!foundA) 
                    foundA = true;
                    a = nums[i-1];
                }
                else if (!foundB) {
                    foundB = true;
                    b = nums[i-1];
                }
        }
        return new int[] {a, b};
    }
}
