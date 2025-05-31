import java.util.HashSet;
import java.util.Set;

public class leetArr80 {
    public static void main(String[] args) {
        System.out.println(findJudge(3, new int[][] {{1,3},{2,3}}));    
    }
    public static int findJudge(int n, int[][] trust) {
        int[] arr = new int[n+1];
        for (int[] tru : trust) {
            arr[tru[0]]--;
            arr[tru[1]]++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] == n-1) {
                return i;
            }
        }
        return -1;
    }
}
