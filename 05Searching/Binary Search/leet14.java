public class leet14 {
    public static void main(String[] args) {
    int[] nums = {5,5,7,7,7,7,7,8,8,8,10,10,10,10,11};
    int l =0;
    int h = nums.length-1;
    int target = 10;
    int a = searchFIndex(nums,l,h,target);
    int b = searchLIndex(nums,l,h,target);
    System.out.println("["+a+","+b+"]");
    }
    public static int searchFIndex(int[] nums, int l, int h, int target){
        while (l <= h) {
            int mid = (l+h)/2;
            if(target > nums[mid]) {
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        return l;
    }
    public static int searchLIndex(int[] nums, int l, int h, int target){
        while (l <= h) {
            int mid = (l+h)/2;
            if(target < nums[mid]) {
                h = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return h;
    }
}
