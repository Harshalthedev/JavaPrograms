import java.util.ArrayList;
import java.util.List;

public class leetArr1287 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,7};
        // int[] arr = {1,1,1,1,1};
        //  (0,1,2), (0,2,2), (2,3,4)
        int cnt = 0;  
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == 0 && i < j) {
                    cnt += j-i;
                }
            }

        } 
        System.out.println(cnt);
    }
}
