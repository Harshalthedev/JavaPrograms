public class leetArr17 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        smallerNumbersThanCurrent(nums);

        
    }
    public static void smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[nums.length];
        int count = 0 ;
        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = 0 ; j < nums.length ; j++ ) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            if (count > 0){
                arr[i] = count;
            }
            if(count == 0 ){
                arr[i] = 0 ;
            }
            count = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
