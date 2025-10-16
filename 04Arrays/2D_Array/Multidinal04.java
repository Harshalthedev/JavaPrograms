import java.util.Arrays;
import java.util.PriorityQueue;

public class Multidinal04 {
    public static void main(String[] args) {
        int[][] interval = {{6,8},{5,10},{1,5},{2,3},{1,10}};
        Arrays.sort(interval, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int grp = 0;
        for (int[] in : interval) {
            if (in[0] > pq.peek()) {
                pq.poll();
            }
            pq.offer(in[1]);
            grp = Math.max(grp, pq.size());
        }
        System.out.println(grp);
    }
}
