import java.util.Arrays;

public class leetArr151 {
    public static void main(String[] args) {
        System.out.println(maxCoins(new int[] {8,9,4,7,5,1,6,2,3}));
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int mySelf = 0;   

        int n = piles.length;
        int i = (n/3);

        for (; i < n-1; i += 2) {
            mySelf += piles[i];
        }
        return mySelf;
    }
}
