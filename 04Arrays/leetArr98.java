import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetArr98 {
    public static void main(String[] args) {
        System.out.println(checkPrimeFrequency(new int[] {1,2,3,4,5,4}));
        System.out.println(checkPrimeFrequency(new int[] {1,2,3,4,5}));
        System.out.println(checkPrimeFrequency(new int[] {2,2,2,4,4}));
        System.out.println(checkPrimeFrequency(new int[] {3,0,3,3,6,3}));
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Return true if any frequency is prime
    public static boolean checkPrimeFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Return true if any frequency is prime
        for (int freq : freqMap.values()) {
            if (isPrime(freq)) {
                return true;
            }
        }

        return false;
    }
}
