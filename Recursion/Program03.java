public class Program03 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,9,14,20};
        int target = 20;

        BinarySearch( arr ,target , 0 , arr.length-1);
    }
    static void BinarySearch(int[] arr ,int target ,int l , int r) {
        
        if(l > r) {
            System.out.println("not found"); return;
        }
        int mid = (l+r)/2;
        if ( arr[mid] == target) {
            System.out.println(mid);
            return;
        }
        if ( arr[mid] > target ) BinarySearch(arr, target, l, mid-1);
        
        else BinarySearch(arr, target , mid+1 , r);
        
    }
}
