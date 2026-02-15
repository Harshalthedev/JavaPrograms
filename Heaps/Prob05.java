import java.util.PriorityQueue;

public class Prob05 {
    public static void main(String[] args) {
        // int[] nums = {1,3,2,6,4,2}; 
        // int[] nums = {10,1,2,2,2,1}; int  k = 4, dist = 3; 
        int[] nums = {10,8,18,9}; int k = 3, dist = 1; 
        // int k = 3;
        // int dist = 3;

        int n = nums.length;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        for (int i = 1; i < n; i++) {
            pq1.offer(nums[i]);
        }
        long cost = (long) nums[0];
        k--;        
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int i = 1;
        while (i < n) {
            int prevInd = i;
            if (k == 0) break;
            int peek = pq1.peek();
            for (; i < n; i++) {
                if (nums[i] == peek) {
                    int cal = (n - i)/k;
                    if (cal > 0) {
                        k--;
                        cost += (long) nums[i];
                        pq1.poll();
                    }
                    else {
                        pq2.offer(peek);
                        pq1.poll();
                        i = prevInd;
                    }
                    break;
                }
            }
            i++;
        }
        System.out.println(cost);
    }
}
