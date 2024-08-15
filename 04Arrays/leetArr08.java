import java.util.*;
public class leetArr08 {
    public static void main(String[] args) {
        int[] hours = {40,17,18,92,10,100,100,38,44,65,44,84,44,10} ;
        int  target = 10;
        // int[] hours = {5,1,4,2,2} ;
        // int  target = 6 ;
        // int[] hours = {0,1,3,4,5} ; 
        // int target = 2 ;
        Arrays.sort(hours);
        if (target > hours[hours.length-1]) {
            System.out.println(0);
            return ;
        }
        if (target >= hours[0]) {
            System.out.println(hours.length);
            return ;
        }
        int s = 0 , e = hours.length ;
        while (s <= e) {
            int mid = s + (e-s)/2 ;
            if (hours[mid] == target) {
                System.out.println((hours.length) - mid);
                return ;
            }
            if (hours[mid] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1 ;
            }
        }
        System.out.println(hours.length - s) ;

    }
}
