import java.util.Arrays;

public class Prob02 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {2}, 3));
    }
       public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        int sum = 0;
        int n = coins.length-1;
        while (n >= 0) {
            while ( (sum+coins[n]) <= amount) {
                sum += coins[n];
                count++;
            }
            if (sum == amount) return count;
            n--;
        }
        if(sum != amount) return -1;
        return count;
    }
    
}
    