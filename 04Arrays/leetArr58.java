public class leetArr58 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        int k = 3;
        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                System.out.print(nums[j]+" ");
            }
            System.out.println();
        }
    }
}
