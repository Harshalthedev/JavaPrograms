public class leetArr22 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6 ;
        int[] arr = new int[2];
        for (int i = 0 ; i < nums.length ; i++ ) {
            for (int j = 1 ; j < nums.length ; j++ ){
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println(arr[0]+" "+arr[1]);
                    return;
                }
            }
        }
    }
}
