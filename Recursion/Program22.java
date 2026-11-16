import java.util.Arrays;

public class Program22 {
    public static void main(String[] args) {
        int[] ans = mergesort(new int[] {8,3,4,12,5,6});
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergesort(int[] arr) {
        int n = arr.length-1;
        return divide(arr, 0, n);
    }
    public static int[] divide(int[] arr, int l, int r) {
        if (l == r) return new int[] {arr[l]};
        int mid = l+ (r - l)/2;
        int[] left = divide(arr, l, mid);
        int[] right = divide(arr, mid+1, r);
        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];
        int i = 0;
        int l = 0;
        int r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) ans[i++] = left[l++];
            else ans[i++] = right[r++];
        }
        while (l < left.length)  ans[i++] = left[l++];
        while (r < right.length) ans[i++] = right[r++];
        
        return ans;
        
    }
}
