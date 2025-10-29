public class Program03 {
    public static void main(String[] args) {
        System.out.println(lexicographicallySmallest("abba"));
        // System.out.println(lexSmallest("caa"));
        System.out.println(lexicographicallySmallest("knm"));
    }
    public static String lexicographicallySmallest(String s) {
        int n = s.length();
        String best = s;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                char[] arr = s.toCharArray();
                reverse(arr, l, r);
                String cand = new String(arr);
                if (cand.compareTo(best) < 0) {
                    best = cand;
                }
            }
        }
        return best;
    }
    private static void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
}
