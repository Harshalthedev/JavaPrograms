import java.util.Arrays;
import java.util.PriorityQueue;

public class Prog04 {
    public static void main(String[] args) {
        System.out.println(matchPlayersAndTrainers(new int[] {4,7,9}, new int[] {8,2,5,8}));
    }
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int trainer : trainers)  pq.offer(trainer);
        
        int match = 0;
        for (int player : players) {
            while (!pq.isEmpty() && player > pq.peek())  pq.poll();
            if (pq.isEmpty()) return match;
            match++;
            pq.poll();
        }
        return match;
    }
}
