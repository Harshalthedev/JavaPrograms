import java.util.ArrayList;
import java.util.List;

public class leetArr144 {
    public static void main(String[] args) {
        List<Integer> list = pancakeSort(new int[] {3,2,4,1});
        System.out.println(list);    
    }
    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int last = arr.length-1;
        while (0 < last--) {
            int curMax = 0;
            int k = -1;
            for (int i = 0; i <= last; i++) {
                if (curMax < arr[i]) {
                    curMax = arr[i];
                    k = i;
                }
            }
            if (curMax == k+1) continue;
            list.add(k+1);
            int l = 0, r = k;
            while (l < r) {
                int temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
            list.add(last+1);
            int a = 0, b = last;
            while (a < b) {
                int temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;
            }
        }
        return list;
    }
}
