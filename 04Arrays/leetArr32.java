public class leetArr32 {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int count = 0;
        int MaxCount = 0;
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[i] == 1) {
                count++;
                MaxCount = Math.max(MaxCount ,count);
            }
            else {
                count = 0;
            }
        }
        System.out.println(count) ;
    }
}