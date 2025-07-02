public class leetArr112 {
    public static void main(String[] args) {
        int[] res = numberOfPairs(new int[] {1,3,2,1,3,2,2});
        System.out.println(res[0]+ " "+res[1]);
    }
    public static int[] numberOfPairs(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        int pairs = 0;
        int leftover = 0;
        for (int num : arr) {
            pairs += num/2;
            leftover += num % 2;
        }
        return new int[] {pairs, leftover};
    }
}
