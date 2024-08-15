public class leetArr13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int l =  0 ; 
        int r = arr.length-1 ;
        // int target = 10;
        while (l <= r) {
            int mid = l+ (r - l)/2 ;

            if (mid < r && arr[mid] > arr[mid+1] ) {
                System.out.println(mid+1);
                return ;
            }
            if (mid>l && arr[mid] < arr[mid-1]) {
                System.out.println(mid);
                return ;
            }
            if (arr[mid] >= arr[l]) {
                l = mid + 1; // Go right
            } else {
                r = mid - 1; // Go left
            }
        }
    }
}
