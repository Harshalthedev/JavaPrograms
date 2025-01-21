public class Program03 {
    public static void main(String[] args) {
        int[] nums = {6,4,5,2,1,1};
        int n = nums.length;
        long expSum = (long) n * (n+1)/2;
        long expSquareSum  = (long) n * (n + 1) * (2*n +1)/6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i : nums) {
            actualSum += (long) i;
            actualSquareSum += (long) i*i;
        }

        long sumDiff = expSum - actualSum; 
        long SqSumDIff = expSquareSum - actualSquareSum;

        long SumPlus = SqSumDIff/sumDiff;

        long missing = (sumDiff + SumPlus)/2;
        long repeating = missing - sumDiff;
        
        System.out.println(missing);
        System.out.println(repeating);

    }
}
