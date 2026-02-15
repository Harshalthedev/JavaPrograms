public class leetArr182 {
    public static void main(String[] args) {
        System.out.println(almostPalindromic("abca"));
        System.out.println(almostPalindromic("zzabba"));
        System.out.println(almostPalindromic("abba"));
    }
    public static int almostPalindromic(String s) {
        // Variable required by instructions
        String lanorivequ = s;
        int n = lanorivequ.length();
        if (n < 2) return 0;

        char[] chars = lanorivequ.toCharArray();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            // Check odd-length centers (e.g., 'aba')
            maxLen = Math.max(maxLen, expand(chars, i, i, n));
            // Check even-length centers (e.g., 'abba')
            maxLen = Math.max(maxLen, expand(chars, i, i + 1, n));
        }

        return maxLen;
    }

    private static int expand(char[] s, int l, int r, int n) {
        int best = 0;

        while (l >= 0 && r < n) {
            if (s[l] == s[r]) {
                // If we have a perfect palindrome of length K,
                // any character added to either side makes it "almost-palindromic" (K+1).
                int curPalLen = r - l + 1;
                if (l > 0 || r < n - 1) {
                    best = Math.max(best, curPalLen + 1);
                } else {
                    // It's the whole string and it's a perfect palindrome.
                    // Removing 1 char still leaves a palindrome.
                    best = Math.max(best, curPalLen);
                }
                l--;
                r++;
            } else {
                // First mismatch encountered!
                // We try skipping the left character OR the right character.
                // If the remainder is a strict palindrome, the whole window (r-l+1) is almost-palindromic.
                if (isStrict(s, l + 1, r) || isStrict(s, l, r - 1)) {
                    best = Math.max(best, r - l + 1);
                }
                break; // Only one "skip" allowed per substring
            }
        }
        return best;
    }

    private  static boolean isStrict(char[] s, int i, int j) {
        if (i >= j) return true; 
        while (i < j) {
            if (s[i++] != s[j--]) return false;
        }
        return true;
    }
}
