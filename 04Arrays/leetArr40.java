public class leetArr40 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int[] arr = new int[nums.length];
        for (int i = 0 ; i < nums.length-1 ;i++ ) {
            if ( nums[i] == nums[i+1] ) {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int j =0;
        for (int i : nums) {
            if ( i > 0) {
                arr[j++] = i;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
