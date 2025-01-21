import java.util.Arrays;

public class Program09 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,3,4};
        int len = arr.length;
        int teamSum = Arrays.stream(arr).sum();
        if ( teamSum % ( len/2) != 0) {
            System.out.println(-1); 
            return;
        }
        
        int targetSum = teamSum / (len/2);
        boolean[] used = new boolean[len];
        long skills = 0;

        for (int i = 0; i < len; i++) {
            if ( used[i]) continue;

            for (int j = i+1; j < len; j++) {
                if (used[j]) continue;

                if ( arr[i] + arr[j] == targetSum ) {
                    skills += arr[i]*arr[j];
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }
        for ( boolean u : used) {
            if ( !u) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(skills);
    }
}
