public class leetArr86 {
    public static void main(String[] args) {
        System.out.println(smallestEquivalentString("parker","morris","parser"));
        System.out.println(smallestEquivalentString("hello","world","hold"));
    }
    static int[] parent = new int[26];
    public static String smallestEquivalentString(String s1, String s2, String baseStr) {
        for ( int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < s1.length(); i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
         // System.out.println(str);
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) return;
        if (px < py) {
            parent[py] = px;
        }
        else parent[px] = py;
    }
    public static int find(int x) {
        if ( parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
