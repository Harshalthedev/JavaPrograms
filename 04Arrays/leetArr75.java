import java.util.Arrays;

public class leetArr75 {
    public static void main(String[] args) {
       System.out.println(new int[] {2,2}); 
    }
    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);

        int l = 0;
        int r = stones.length-1;

        while (l < r) {
            if (stones[r] > stones[r-1]) {
               stones[r-1] = stones[r] - stones[r-1];
            }
            r -= 2;
            Arrays.sort(stones);
        }
        return stones[0];
    }
}
