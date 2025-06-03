public class leetArr84 {
    public static void main(String[] args) {
        int[] arr = fairCandySwap(new int[] {1,1}, new int[] {2,2});
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        for ( int i : aliceSizes) {
            aliceSum += i;
        }
        int bobSum = 0;
        for ( int i : bobSizes) {
            bobSum += i;
        }
        for ( int i = 0; i < aliceSizes.length; i++) {
            int a = aliceSum - aliceSizes[i];
            for ( int j = 0; j < bobSizes.length; j++) {
                int b = bobSizes[j];
                int tempa = a + b;
                int tempb = bobSum - b + aliceSizes[i];
                if( tempa == tempb) {
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[] {};
    }
}
