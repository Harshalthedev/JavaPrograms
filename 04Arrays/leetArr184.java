public class leetArr184 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = roatedSort(nums);
        System.out.println(roatedSort(nums));
        if (nums[0] <= target && target <= nums[pivot-1]) System.out.println(binary(nums, 0, pivot-1, target));
        else System.out.println(binary(nums, pivot, nums.length-1, target));
    }
    public static int roatedSort(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l < r) {
            int mid = l + (r-l)/2;
            if (nums[mid] > nums[mid+1]) return mid+1;
            if (nums[mid] > nums[r]) l = mid+1;
            else r = mid;
        }
        return l;
    }

    public static int binary(int[] nums, int l, int r, int target) {
        while (l < r) {
            int mid = l+ (r - l) /2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid -1;
            else r = mid +1;
        }
        return l;
    }

}