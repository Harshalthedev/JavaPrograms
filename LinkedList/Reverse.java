class Reverse {
    public static void main(String[] args) {
        int[] arr = {5,6,3,3,2,1};

        int n = arr.length;

        long expectedSum = n*(n+1)/2;
        long expectedSquareSum = n*(n+1)*(2*n+1)/6;

        long actualSum = 0;
        long actualSquareSum = 0;
        for (int num : arr) {
            actualSum += num;
            actualSquareSum += num*num;
        }

        long diffSum = expectedSum - actualSum;
        long diffSquareSum = expectedSquareSum - actualSquareSum;

        int reapting = (int) (diffSquareSum/diffSum+diffSum)/2;
        int missing =  reapting - (int) diffSum;

        System.out.println("repeating: "+ reapting);
        System.out.println("missing: "+ missing);
    }
}