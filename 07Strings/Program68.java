public class Program68 {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {1,2,3,4}));
    }
     public static int minOperations(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (!isPrime(nums[i])) {
                    int nxtPri = nextPrime(nums[i]);
                    cnt += nxtPri - nums[i];
                } 
            }
            else {
                int num = nums[i];
                // if (nums[i] == 2) cnt += 2;
                // else if (nums[i] == 3) cnt++;
                while(isPrime(num)) {
                    num++;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        return cnt;
    }
    public static int nextPrime(int n) {
        if (n <= 1) return 2;
        int candidate = (n % 2 == 0) ? n+1 : n+2;
        while (!isPrime(candidate)) {
            candidate += 2;
        }
        return candidate;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i+= 6) {
            if (n % i == 0 || n % (i+2) == 0) return false;
        }
        return true;
    }
}
