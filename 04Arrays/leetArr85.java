public class leetArr85 {
    public static void main(String[] args) {
        System.out.println(kLengthApart(new int[] {1,0,0,0,1,0,0,1}, 2));
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ind = i;
                break;
            }
        }
        int cnt = 0;
        for (int i = ind+1; i < nums.length; i++) {
            if (nums[i] == 0) cnt++;
            else {
                if (cnt < k) return false;
                cnt = 0;
            }
        }
        return true;
    }
}
