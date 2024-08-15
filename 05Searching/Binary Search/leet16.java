public class leet16 {
    public static void main(String[] args) {
        int[] nums = {10,1,10,10,10};
        int l = 0;
        int h = nums.length-1;
        while(l <= h) {
            int mid = l + ( h - l)/2;
            if(mid < h && nums[mid] > nums[mid+1]) {
                System.out.println(nums[mid+1]);
                return ;
            }
            if(mid > l && nums[mid] < nums[mid-1]) {
                System.out.println(nums[mid]);
                return;
            }
            if(nums[l] == nums[mid] && nums[h]== nums[mid]) {
                l = l+1;
                h = h-1;
            }
            
            if(nums[mid] >= nums[l]) {
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        System.out.println(nums[0]);
    }
}
