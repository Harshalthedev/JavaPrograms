public class Program11 {
    public static void main(String[] args) {
        int[] arr = { 2,1,5,6,8,4,9};
        System.out.println(linearSearch(arr ,9 ,0));
    }
    static int linearSearch(int[] arr ,int target, int i) {
        if ( i == arr.length)    return -1;
        
        return ( target == arr[i]) ? i : linearSearch(arr, target, ++i);
    }
}
