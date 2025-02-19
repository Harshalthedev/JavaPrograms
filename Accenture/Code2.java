public class Code2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(max_cake_peices(n));
    }

    public static int max_cake_peices(int n) {
        int max_cake_peices = 1;
        for (int i = 0; i <= n; i++) {
            max_cake_peices = max_cake_peices +i;
        }

        max_cake_peices = n*(n+1)/2;
        return max_cake_peices+1;
    }
}
