public class leetArr164 {
    public static void main(String[] args) {
        int[] res = getNoZeroIntegers(10000);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] getNoZeroIntegers(int n) {
        
        for (int a = 1; a <= n; a++) {
            if (checkZeros(a)) continue;
            int b = n - a;
            if(!checkZeros(b)) return  new int[] {a, b};
        }

        return new int[] {};
    }
    public static boolean checkZeros(int n) {
        while (n > 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
}
