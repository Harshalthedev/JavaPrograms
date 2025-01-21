public class Program16 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,9,1,2,3,4};
        System.out.println(rotated(arr,0, arr.length-1,3));
    }
    static int rotated(int[] arr ,int l , int r, int target) {
        if ( l <= r) {
            int mid = l+(r-l)/2;
            if (target == arr[mid]) {
                return mid;
            }
            // left array
            if ( arr[l] <= arr[mid]) {
                if(target >= arr[l] && target < arr[mid]) {
                    // r = mid-1;
                    return rotated(arr,l, mid-1,3);
                }
                else {
                    // l = mid+1;
                    return rotated(arr,mid+1, r,3);
                }
            }
            // right array
            else {
                if ( target > arr[mid] && target <= arr[r] ) {
                    // l = mid+1;
                    return rotated(arr,mid+1, r,3);
                }
                else {
                    // r = mid-1;
                    return rotated(arr,l, mid-1,3);
                }
            }
        }
        return -1;
    }
}
  