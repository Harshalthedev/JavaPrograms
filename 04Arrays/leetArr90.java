public class leetArr90 {
    public static void main(String[] args) {
        System.out.println(maxDifference("aaaaabcb"));
    }
    public static int maxDifference(String s) {
        int[] chars = new int[26];
        for (char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for (int freq : chars) {
            if (freq != 0 && freq % 2 != 0 && odd < freq) odd =  freq;
            else if (freq != 0 && freq % 2 == 0 && even > freq) even = freq; 
        }
        return odd-even;
    }
}
