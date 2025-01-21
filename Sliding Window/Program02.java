import java.util.Arrays;

class Program02 {
    public static void main(String[] args) {
        int[] nums = {4,3,6,2,1,1};
        //  here the element of array are  1 to n
        int n = nums.length;
        Arrays.sort(nums);
        int sum = n *( n + 1) /2;
        int rep = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if ( nums[i] == nums[i+1]) {
                rep = nums[i];
                break;
            }
        }
        int sum2 = 0;
        for (int i : nums) {
            sum2 += i;
        }
        sum = sum - (sum2-rep);
        System.out.println(rep+" "+sum);
    }
}