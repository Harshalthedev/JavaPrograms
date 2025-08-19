public class leetArr153 {
    public static void main(String[] args) {
        System.out.println(zeroFilledSubarray(new int[] {1,2,0,0,0,2,0,0}));
    }
    public static long zeroFilledSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        long cnt = 0;
        while (r < n) {
            if (nums[r] == 0){
                l = r;
                while (r+1 < n && nums[r+1] == 0) r++;
                long len = (long) (r-l+1);
                cnt += (len*(len+1))/2;    
            }  
            r++;
        }
        return cnt;
    }
}
