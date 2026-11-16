import java.util.Arrays;

public class leetArr183 {
    public static void main(String[] args) {
        // System.out.println(minOperations("card"));
        System.out.println(minOperations("edc"));
    }
        public static int minOperations(String s) {
        // char[] sorted = s.toCharArray();
        // Arrays.sort(sorted);

        int cnt = 0;
        String s1 = s.substring(0, s.length()-1);
        char[] sorted1 = s1.toCharArray();
        char[] sorted2 = new char[sorted1.length];
        for (int i = 0; i < sorted1.length; i++) {
            sorted2[i] = sorted1[i];
        }
        Arrays.sort(sorted2);
        if (!Arrays.equals(sorted1, sorted2)) {
            cnt++;
        }
        char ch = s.charAt(s.length()-1);
        for (int i = sorted1.length-1; i >= 0; i--) {
            if (sorted2[i] > ch) cnt++;
            else {
                System.out.println(cnt);
                return cnt;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
