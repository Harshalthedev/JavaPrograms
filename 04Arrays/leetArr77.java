import java.util.PriorityQueue;

public class leetArr77 {
    public static void main(String[] args) {
        System.out.println(minStoneSum(new int[] {5,4,9}, 2));
    }
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int pile : piles) {
            queue.offer(pile);
        }
        // while(!queue.isEmpty()) {
        //     System.out.println(queue.poll());
        // }

        for (int i = 0; i < k; i++) {
            double ele = queue.poll();
            int stone = (int) Math.ceil(ele/2);
            System.out.println(stone);
            queue.offer(stone);
        }
        int sum = 0;
        while(!queue.isEmpty()) {
            sum += queue.poll();
        }
        return sum;
    }
}
