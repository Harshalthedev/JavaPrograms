import java.util.Arrays;

public class leetArr118 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(arr[i], prefix[i-1]);
        }
        int[] suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i+1], arr[i]);
        }
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = prefix[i];
            int right = suffix[i];
            water += Math.min(left, right) - arr[i];
        }
        System.out.println(water);
    }
}
