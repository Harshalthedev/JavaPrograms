public class leetArr174 {
    public static void main(String[] args) {
        System.out.println(countTriples(5));
    }   
    public static int countTriples(int n) {
        int[] sq = new int[16];
        for (int i = 0; i <= 15; i++) {
            sq[i] = i * i;
        }
        int cnt = 0;
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                int sum = (i*i) + (j*j);
                int root = (int) Math.sqrt(sum);
                if (root <= 15 && sq[root] == sum) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
