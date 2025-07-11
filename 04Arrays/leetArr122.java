import java.util.HashMap;
import java.util.Map;

public class leetArr122 {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[] {1,2,3,2,2}));
        System.out.println(totalFruit(new int[] {1,2,1}));
        System.out.println(totalFruit(new int[] {0,1,2,2}));
        System.out.println(totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
    }
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int maxFruit = 0;
        for (int r = 0; r < fruits.length; r++) {
            int fruitType = fruits[r];
            map.put(fruitType, map.getOrDefault(fruitType, 0)+1);
            while (map.size() > 2) {
                int fruit = fruits[l];
                map.put(fruit, map.get(fruit)-1);
                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }
                l++;
            }
            maxFruit = Math.max(maxFruit, r-l+1);
        }
        return maxFruit;
    }
}
