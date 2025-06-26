public class leetArr104 {
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int left = minWeight(weights);
        int right = sumWeight(weights);

        while(left < right) {
            int mid = left + (right-left)/2;
            if (canShip(weights, days, mid)) {
                right = mid;
            }
            else left = mid+1;
        }
        return left;
    }
    public static boolean canShip(int[] weights, int days, int capacity) {
        int dailyLoad = 0;
        int cntDay = 1;
        for (int w : weights) {
            if (w + dailyLoad > capacity) {
                dailyLoad = 0;
                cntDay++;
            }
            dailyLoad += w;
        }
        return cntDay <= days;
    }
    public static int minWeight(int[] weights) {
        int max = 0;
        for (int w : weights) {
            max = Math.max(w, max);
        }
        return max;
    }
    public static int sumWeight(int[] weights) {
        int sum = 0;
        for  (int w : weights) {
            sum += w;
        }
        return sum;
    }
}
