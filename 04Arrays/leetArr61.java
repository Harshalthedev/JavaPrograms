import java.util.Arrays;

public class leetArr61 {
    public static void main(String[] args) {
        System.out.println(splitNum(4325));
    }
    public static int splitNum(int num) {
        int len = String.valueOf(num).length();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = num%10;
            num /=10;
        }
        Arrays.sort(nums);
        int num1 = 0;
        int num2 = 0;
        for ( int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                num1 = (num1*10) + nums[i];
            }
            else {
                num2 = (num2*10)+ nums[i];
            }
        }
        return num1+num2;
    }
}
