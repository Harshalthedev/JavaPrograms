public class leet09 {
    static int peakindex(int[] nums,int target) {
        int  l=0;
        int h = nums.length-1;
        while ( l <= h) {
            int mid = l + (h-l)/2;
            if(mid < h && nums[mid] > nums[mid+1] && target == nums[mid] ) {
            return mid;
            } 
            if (mid > l && nums[mid] < nums[mid-1] && target == nums[mid-1] ) {
            return  mid-1;
            }
            if (nums[l] > nums[mid]) {
               h = mid -1;
            }
            else {
                l = mid+1;
            }
            if(nums[mid] == nums[l] && nums[mid] == nums[h]) {
                if(nums[l] > nums[l+1]) {
                    return l;
                }
                l++;
                if(nums[h] < nums[h-1]){
                    return h-1;
                }
                h--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] nums = {4,5,6,7,8,0,1,2};
        int[] nums = {2,9,2,2,2,};
        int target = 9;
        System.out.println(peakindex(nums,target));
    }
}
