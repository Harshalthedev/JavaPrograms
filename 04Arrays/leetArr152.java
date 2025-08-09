public class leetArr152 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {10,20,30,10}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int prev2 = cost[0];   
        int prev1 = cost[1];  
        int n = cost.length; 
        for ( int i = 2; i < n; i++ ) {
            int cur = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = cur;
        }
        return Math.min(prev1, prev2);
    }

}
