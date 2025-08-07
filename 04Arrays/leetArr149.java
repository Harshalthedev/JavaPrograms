import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class leetArr149 {
    public static void main(String[] args) {
        System.out.println(numOfUnplacedFruits(new int[] {4,2,5},new int[] {3,5,4}));
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;

        // Create list of baskets with (capacity, index)
        List<int[]> basketList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            basketList.add(new int[]{baskets[i], i});
        }

        boolean[] used = new boolean[n];
        int unplacedCount = 0;

        for (int fruit : fruits) {
            boolean placed = false;

            // Try to find a basket that fits
            for (int i = 0; i < n; i++) {
                int capacity = basketList.get(i)[0];
                int index = basketList.get(i)[1];

                if (!used[index] && capacity >= fruit) {
                    used[index] = true;
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                unplacedCount++;
            }
        }

        return unplacedCount;
    }
}
