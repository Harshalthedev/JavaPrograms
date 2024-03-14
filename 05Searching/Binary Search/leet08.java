public class leet08 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int mid = peakindex(arr);
        int left = searchl(arr,0,mid,target);
        int right = searchr(arr,mid,arr.length-1,target);
        if(left < right) {
            System.out.println(left);
        }
        else {
            System.out.println(right);
        }
    }
    static int searchl(int[] arr, int l ,int h,int target) {
        while(l <= h) {
            int mid = l+(h-l)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target  > arr[mid]) {
                l = mid+1;
            }
            else h = mid-1;
        }
        return -1;
    }
    static int searchr(int[] arr, int l ,int h,int target) {
        while(l <= h) {
            int mid = l+(h-l)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(target  < arr[mid]) {
                l = mid+1;
            }
            else h = mid-1;
        }
        return -1;
    }
    static int peakindex(int[] arr){
        int l =0;
        int h = arr.length-1;
        while(l < h) {
            int mid = l+(h-l)/2;
            if(arr[mid] > arr[mid+1]) {
                h = mid;
            }
            else l = mid+1; 
        }
        return l;
    }
}