import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetArr123 {

    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        int n = fruits.length;

        // Create list of baskets with (capacity, index)
        List<int[]> basketList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            basketList.add(new int[]{baskets[i], i});
        }
        basketList.sort(Comparator.comparingInt(a -> a[1]));
        for (int[] is : basketList) {
            System.out.println(Arrays.toString(is));
        }
        // Sort baskets by index (left to right)
    }
}
