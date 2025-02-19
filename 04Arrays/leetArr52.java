import java.util.Arrays;
public class leetArr52 {
    public static void main(String[] args) {
        int[] g = {1,2}; 
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g, s));
       
    }

public static int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int g_len = g.length;
    int s_len = s.length;
    int i = 0;
    int j = 0;
    int count = 0;
    while ( i < g_len && j < s_len ) {
        if ( s[j++] >= g[i++]) count++;
        else if ( g[i] > s[j]) j++;
    }
    return count;
}
}