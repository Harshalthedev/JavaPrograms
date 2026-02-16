public class Program65 {
    public static void main(String[] args) {
        System.out.println(prefixConnected(new String[] {"apple","apply","banana","bandit"}, 2));
    }
    public static int prefixConnected(String[] words, int k) {
        int cnt = 0;
        int n = words.length;
        for ( int i = 0; i < n; i++) {
            if (words[i].equals("-") || words[i].length() < k ) continue;
            String str = words[i].substring(0, k);
            boolean grp = false;
            for (int j = i+1; j < n; j++) {
                if (words[i].equals("-") || words[j].length() < k ) continue;
                if (str.equals(words[j].substring(0, k))) {
                    grp = true;
                    words[j] = "-";
                }
            }
            if (grp) cnt++;
        }
        return cnt;
    }
}
