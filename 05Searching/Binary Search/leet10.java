public class leet10 {
    public static void main(String[] args) {
        
        int[] nums = {2,7,11,15} ;
        int target =9;
        System.out.println(twoSum(nums,target));
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for (int i=1;i < n ; i++) {
            int j = i-1;
            int sum = nums[i] + nums[j];
            if(sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
        }
        return arr;
    }
}
