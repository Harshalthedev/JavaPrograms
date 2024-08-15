public class leet17 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6}; 
        int target = 5;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l <= h) {
            int mid = l+ (h-l)/2;
            if(target == nums[mid]) {
                return mid;
            }
            else if(nums[mid] < target) {
                l = mid +1;
            }
            else {
                h = mid -1;
            }
        }
        return l;
    }
}
