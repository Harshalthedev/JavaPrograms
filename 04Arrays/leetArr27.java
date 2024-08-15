public class leetArr27 {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3}; //9
        int x = 0; // 25
        int y = 0;  // 16
        for (int i = 0 ; i < nums.length ; i++ ) {
            x = x + nums[i];

            if(nums[i] <= 9) {
                y = y + nums[i];
            }
            else {
                int n = nums[i];
                while ( n > 0 ) {
                    y = y + (n % 10);
                    n = n/10;
                }
            }
        }
        System.out.println(x-y);

    }
}
