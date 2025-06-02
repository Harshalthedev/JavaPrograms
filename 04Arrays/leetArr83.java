import java.util.ArrayList;
import java.util.List;

public class leetArr83 {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[] {5,6,7,8,9}, 9));
    }
    public static int findKthPositive(int[] arr, int k) {
        if (arr.length == 1 && k == 1) return arr[0] > 1 ? 1 : arr[0]+1;
        List<Integer> list = new ArrayList<>();
        for ( int i = 1; i < arr[0]; i++) {
            list.add(i);
        }
        for (int i = 1; i < arr.length; i++) {
            int st = arr[i-1]+1;
            for (int j = st; j < arr[i]; j++) {
                list.add(j);
                if (list.size() >= k)  return list.get(k-1);    
            }
        }
        return arr[arr.length-1] + k - list.size();
    }
}
