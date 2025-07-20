import java.util.Arrays;

public class leetArr130 {
    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[] {1,6,3,1,2,5}, 20));
    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int i = 0;
        int maxBars = 0;
        while (i < n && coins >= costs[i]) {
            maxBars++;
            coins -= costs[i];
            i++;
        }
        return maxBars;
    }
}
