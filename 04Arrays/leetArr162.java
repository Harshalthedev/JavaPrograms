import java.util.PriorityQueue;

public class leetArr162 {
    public static void main(String[] args) {
        System.out.println(maxAverageRatio(new int[][]{{1,2},{3,5},{2,2}}, 2));
    }
    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        double n = (double) classes.length;
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Double.compare(b[2], a[2])  
        );
        
        for (int[] clazz : classes) {
            double p = (double) clazz[0];
            double t = (double) clazz[1];   
            double pRatio = ((p + 1d) / (t + 1d)) - p / t;
            maxHeap.offer(new double[] {p, t, pRatio});
        }

        for (int i = 0; i < extraStudents; i++) {
            double[] clazz = maxHeap.poll(); 
            double p = clazz[0];
            double t = clazz[1];   
            double delta = ((p + 1d) / (t + 1d)) - (p / t);
            maxHeap.offer(new double[] { p + 1d, t + 1d, delta});
        }

        double ratio = 0d;
        while (!maxHeap.isEmpty()) {
            double[] clazz = maxHeap.poll();
            double p = clazz[0];
            double t = clazz[1];
            ratio += (double) p/t;
        }

        return (double) ratio/n;
    }

}