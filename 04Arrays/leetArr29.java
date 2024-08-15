public class leetArr29 {
    public static void main(String[] args) {
        // int[] nums ={1,-3,2,3,-4};
        int[] nums ={2,-5,1,-4,3,-2};
        int max = 0;
        int min= 0;
        int cur_max = 0;
        int cur_min = 0;

        for (int i = 0; i < nums.length; i++) {
            
            cur_max +=  nums[i];
            cur_min += nums[i];
            max = Math.max(cur_max,max);
            min = Math.min(cur_min,min);
            if (cur_min > 0) {
                cur_min = 0;
            }
            if (cur_max < 0) {
                cur_max = 0;
            }

        }
        System.out.println(Math.max(max,Math.abs(min)));
    }
}
