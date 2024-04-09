public class leet11 {
    public static void main(String[] args) {
        // int[] nums = {3,4,5,6,7,8,9,2};
        int[] nums = {11,12,13,14};
        System.out.println(search(nums));
    }
    public static int search(int[] nums) {
        int l =0;
        int h = nums.length-1;
        while (l <= h) {
            int mid = l +(h-l)/2;
            if(mid < h && nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            if(mid > l && nums[mid] < nums[mid-1]) {
                return nums[mid];
            }
            if(nums[mid] > nums[l]) {
                l = mid+1;
            }
            else h = mid-1;
        }
        return nums[0];
    }
}
