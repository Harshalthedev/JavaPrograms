import java.util.Arrays;

public class Program47 {
    public static void main(String[] args) {
        System.out.println(numOfSubsequences("LT"));
    }
        public static long numOfSubsequences(String s) {
        int[] chars = new int[3];
        for (char ch : s.toCharArray()) {
            if (ch == 'L') chars[0]++;
            else if (ch == 'C') chars[1]++;
            else if (ch == 'T') chars[2]++;
        }
        if ( chars[0] > 0 && chars[1] > 0 && chars[2] == 0) {
            chars[2]++;
            int[] LCT = {chars[0], chars[1], chars[2]};
            Arrays.sort(LCT);
            long max = (long)LCT[2] * LCT[1];
            return max;
        }
        else if (chars[0] > 0 && chars[2] > 0 && chars[1] == 0) {
            chars[1]++;
            int[] LCT = {chars[0], chars[1], chars[2]};
            Arrays.sort(LCT);
            long max = (long)LCT[2] * LCT[1];
            return max;
            
        }
        else if (chars[1] > 0 && chars[2] > 0 && chars[0] == 0) {
            chars[0]++;
            int[] LCT = {chars[0], chars[1], chars[2]};
            Arrays.sort(LCT);
            long max = (long)LCT[2] * LCT[1];
            return max;
            
        }
        chars[0]++;
        if (chars[0] == 0 || chars[1] == 0 || chars[2] == 0)  return 0;
        int[] LCT = {chars[0], chars[1], chars[2]};
        Arrays.sort(LCT);
        long max = (long)LCT[2] * LCT[1];
        return max;
    }
}
