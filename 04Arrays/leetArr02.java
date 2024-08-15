public class leetArr02 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] concat_nums = new int[nums.length*2];
        int[] newarray = getconcatination(nums);
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i]+" ");
        }
    }
    public static int[] getconcatination(int[] nums) {
        int[] concat_nums = new int[nums.length*2];
        int j = 0;
        for ( int i = 0; i < nums.length; i++) {
            concat_nums[j] = nums[i];
            if (i == nums.length-1) {
                i = 0;
            }
            if (j == concat_nums.length-1) {
                break;
            }
            j++;
        }
        return concat_nums;
    }
}
