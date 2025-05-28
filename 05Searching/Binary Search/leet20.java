public class leet20 {
    static int a;
    public static void main(String[] args) {
        int[] nums = {1,1,2,5,6,7,9}; 
        int tar = 1;  
        int l = 0; 
        int r = nums.length-1;
        Integer n = null;
        boolean t;
        System.out.println();
        // while (l <= r) {
        //     int mid = l+(r-l)/2;
        //     if (tar == nums[mid]) {
        //         System.out.println(mid);
        //         return;
        //     }
        //     if (nums[mid] > tar) {
        //         r = mid-1;
        //     }
        //     else l = mid+1;
        // }
        // if (tar < nums[0] || tar > nums[nums.length-1]) System.out.println(-1);
        // System.out.println(l);
        // System.out.println(l-1);
    }
}
