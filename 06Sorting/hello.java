import java.util.*;
public class hello {
    public static void main(String[] args) {
        int[] arr = {5,2,6,8,4,3,9};
        System.out.println(thridelement(arr));
    }    
    public static int thridelement(int[] arr) {
        Integer f = null;
        Integer s = null;
        Integer t = null;

        int i = 0;
        while ( i < arr.length) {
            if ( Objects.equals(f, arr[i]) && Objects.equals(arr[i], s) && Objects.equals(t, arr[i])) {
                continue;
            }

            if (f == null || f < arr[i]) {
                t = s;
                s = f;
                f = arr[i];
            }
            else if (s == null || s < arr[i] && f > arr[i]) {
                t = s;
                s = arr[i];
            }
            else {
                t = arr[i];
            }
            i++;
        }
        return t != null ? t : f;
    }
}
