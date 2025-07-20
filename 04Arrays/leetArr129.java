public class leetArr129 {
    public static void main(String[] args) {
        System.out.println(sumOfEncryptedInt(new int[] {10,21,31}));
    }
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += encrypt(num);
        }
        return sum;
    }
    public static int encrypt(int x) {
        int maxDigit = 0;
        int len = 0;
        while(x > 0) {
            maxDigit = Math.max(maxDigit, x % 10);
            x /= 10;
            len++;
        }
        int encryptDigit = 0;
        while (len > 0) {
            encryptDigit = (encryptDigit * 10) + maxDigit;
            len--;
        }
        return encryptDigit;
    }
}
