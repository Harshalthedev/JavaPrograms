public class leetArr100 {
    public static void main(String[] args) {
        int[] res = shortestToChar("loveleetcode", 'e');
    }
    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        String s1 = s;
        int i = 0;
        int last = 0;
        while (i < s.length() && !s1.isEmpty()) {
            int idx = s1.indexOf(c);
            res[i] = Math.abs(last + idx-i);
            if (i < s.length() && res[i] == 0) {
                last = i+1;
                s1 = s.substring(i+1);
                System.out.println(s1);
            }
            i++;
        }
        
        String s2 = s;
        int j = 0;
        int last1 = 0;
        while (!s2.isEmpty() && j >= 0) {
            int idx = s2.lastIndexOf(c);
            res[j] = Math.min(res[j], last1+Math.abs(idx-j));
            if (j > 0 && res[j] == 0) {
                last1 = j+1;
                s2 = s.substring(0, j-1);
            }
            j--;
        }
        for (int k : res) {
            System.out.print(k+" ");
        }
        return res;
    }
}
