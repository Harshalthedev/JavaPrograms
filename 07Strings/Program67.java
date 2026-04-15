public class Program67 {
    public static void main(String[] args) {
        char ch = 'k';
        System.out.println(ch > 9);
        char ans =  (char) ('a' + (25 - (ch - 'a')));
        System.out.println(ans);
        char mirror = (char) ('0' + (9 - (ch - '0')));
        System.out.println(mirrorFrequency("kk"));
    }
    public static int mirrorFrequency(String s) {
        int[] alpha = new int[26];
        int[] numer = new int[10];
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                alpha[ch - 'a']++;
            }
            else numer[ch - '0']++;
        }
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                char mirror = (char) ('a' + (25 - (ch - 'a')));
                cnt += Math.abs(alpha[ch - 'a'] - alpha[mirror - 'a']);
            }
            else {
                char mirror = (char) ('0' + (9 - (ch - '0')));
                cnt += Math.abs(numer[ch - '0'] - numer[mirror - '0']);
            }
        }
        return cnt;
    }
}