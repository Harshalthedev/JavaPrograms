import java.util.PriorityQueue;
public class Prob03 {
    public static void main(String[] args) {
        System.out.println(kthLargestNumber(new String[] {"3","6","7","10"}, 4));
        // System.out.println(kthLargestNumber(new int[] {5,8,1,9,10,4}, 4));
    }
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(); 
        for (String str : nums) {
            heap.offer(Integer.parseInt(str));
            if (k < heap.size()) {
                heap.poll();
            }

        }
        return Integer.toString(heap.poll());
    }
}
