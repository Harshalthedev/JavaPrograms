public class leetArr140 {
    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
    }
    public static boolean checkDivisibility(int n) {
        int temp = n;
        long digitSum = 0;
        long digitProd = 0;
        while (temp > 0) {
            digitSum += (long)temp % 10;
            digitProd *= (long)temp % 10;
            temp /= 10;
        }
        System.out.println(digitSum);
        System.out.println(digitProd);
        long sum = digitSum + digitProd;
        return (n % sum == 0); 
    }
}
