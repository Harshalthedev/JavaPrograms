public class leetArr33 {
    public static void main(String[] args) {
        // int[] arr = {0,3,2,1};
        // int[] arr = {3,5,5};
        // int[] arr = {2,0,2};
        int[] arr = {0,3,2,1};
        int l = 0 ;
        int  h = arr.length-1;
        if ( h == 1 || h == 0){
            System.out.println(false);
            return;
        }
        while ( l <= h) {
            if (l == h) {
                System.out.println(true);
                return;
            }
            if ( arr[l+1] > arr[l] ) {
                l++;
            }
            if ( arr[h-1] > arr[h] ) {
                h--;
            }
            if ( (l == 0 && arr[l] > arr[l+1]) || (h == arr.length-1 && arr[h] > arr[h-1] )) {
                System.out.println(false);
                return;
            }
            if (  arr[l+1] == arr[l] || arr[h-1] == arr[h] ) {
                System.out.println(false);
                return ;
            }
        }
        System.out.println(false);
    }
}
