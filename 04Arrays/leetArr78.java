public class leetArr78 {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {3,9,7}, 5));
    }
    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for ( int num : nums) {
            sum += num;
        }
        if(sum < k ) return sum;
        int temp = 0;
        int i = 1;
        while (k*i <= sum) {
            temp = k*i;
            i++;
        }
        return sum - temp;
    }
}
