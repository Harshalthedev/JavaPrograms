public class leetArr99 {
    public static void main(String[] args) {
        String[] res = divideString("abcdefghij", 3, 'x');
        for (String string : res) {
            System.out.print(string+" ");
        }
        System.out.println();
        String[] res2 = divideString("abcdefghi", 3, 'x');
        for (String string : res2) {
            System.out.print(string+" ");
        }
    }
    public static String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int part = 0;
        if (n % k == 0) part = n/k;
        else part = (n/k)+1;
        String[] res = new String[part];
        int j = 0;
        for (int i = 0; i <= n-k; i += k) {
            res[j++] = s.substring(i, i+k);
        }  
        if (n % k != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(n - n % k));
            for (int i = 0; i < k - (n % k); i++) {
                sb.append(fill);
            }
            res[j] = sb.toString();
        }
        return res;
    }
}
