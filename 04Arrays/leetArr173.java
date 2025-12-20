public class leetArr173 {
    public static void main(String[] args) {
        // System.out.println(totalWaviness(4848, 4848));
        // System.out.println(sumAndMultiply(10203004));
        int[] res = sumAndMultiply("10203004", new int[][] {{0,7},{1,3},{4,6}});
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
    public static int totalWaviness(int num1, int num2) {
        if (num1 < 100 && num2 < 100) return 0;
        if (num1 < 100) num1 = 100;
        else if (num2 < 100) num2 = 100;
        int pv = 0;
        for (int n = num1; n <= num2; n++) {
            String op = Integer.toString(n);
            for (int i = 1; i < op.length()-1; i++) {
                char ch = op.charAt(i);
                if (op.charAt(i-1) < ch && ch > op.charAt(i+1)) pv++;
                else if (op.charAt(i-1) > ch && ch < op.charAt(i+1)) pv++;
            }
        }
        return pv;
    }
        public static long sumAndMultiply(int n) {
        int temp = n;
        StringBuilder sb = new StringBuilder();
        while (temp > 0) {
            int rem = temp % 10;
            if (rem != 0) sb.append(rem);
            temp /= 10;
        }
        String num = sb.reverse().toString();
        long x = Long.parseLong(num);
        long sum = 0;
        for (char ch : num.toCharArray()) {
            sum += (long) (ch - '0');
        }
        return sum * x;
    }
    public static int[] sumAndMultiply(String s, int[][] queries) {
        int len = queries.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++)  {
            int a = queries[i][0];
            int b = queries[i][1];
            String sub = s.substring(a, b+1);
            System.out.println(sub);
            Long num = 0l;
            Long sum = 0l;
            if (sub.length() != 0) {
                for (char ch : sub.toCharArray()) {
                    if (ch != '0') {
                        Long c = (long) ch - '0';
                        sum += c;
                        num = num * 10 + c;
                    }
                }
            }            
            res[i] = (int) ((num * sum) % 1000000007l);
        }
        return res;
    }
}
