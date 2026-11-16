import java.util.PriorityQueue;

public class Problem02 {
    public static void main(String[] args) {
        System.out.println(maximumSum(new int[] {4,1,-5,2}, 2, 1, 3));
    }
    public static long maximumSum(int[] nums, int m, int l, int r) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            long sum = 0l;
            for (int j = i; j < n; j++) {
                sum += (long) nums[j];
                int len = j-i+1;
                if (len >= r) break;
                if (len > l && len < r) {
                    pq.offer(sum);
                }
            }
        }
        long totalSum = 0l;
        for (int i = 0; i <= m; i++) {
            long sum = pq.poll();
           totalSum += sum > 0l ? sum : 0l; 
        }
        return totalSum;
    }
}