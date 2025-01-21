public class Program10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9};
        System.out.println(sorted(arr, 0 ));
    }
    static boolean sorted(int[] arr , int l) {
        if ( l == arr.length-1)    return true;
        
        if ( arr[l] > arr[l+1] )   return false;

        return sorted( arr, l+1);
    }
}
