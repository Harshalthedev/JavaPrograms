public class leetArr180 {
    public static void main(String[] args) {
        System.out.println(longestBalanced("abbac"));
        System.out.println(longestBalanced("zzabccy"));
        System.out.println(longestBalanced("aba"));
    }
    public static int longestBalanced(String s) {
        int maxLen = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] charFreq = new int[26];
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                int chInd = ch - 'a';
                charFreq[chInd]++;
                boolean allSame = true;
                int freq = charFreq[s.charAt(i) - 'a'];
                for (int k = i; k <= j; k++) {
                    if (freq != charFreq[s.charAt(k) - 'a']) {
                        allSame = false;
                        break;
                    }
                }
                if (allSame) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
                
            }
        }
        return maxLen;
    }
}
