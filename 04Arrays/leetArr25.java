import java.util.*;
public class leetArr25 {
    public static void main(String[] args) {
        // int[] heights = {1,1,4,2,1,3};
        // int[] heights = {2,1,2,1,1,2,2,1};
        int[] heights ={5,1,2,3,4};
        int n = heights.length;
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i++ ) {
            arr[i]  = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;

        for ( int i = 0 ; i < n ; i++ ){
            if ( heights[i] != arr[i] ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
