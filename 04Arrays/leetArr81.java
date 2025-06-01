public class leetArr81 {
    public static void main(String[] args) {
        int[] res = distributeCandies(80, 4);
            for (int k : res) {
                System.out.print(k+" ");
            }
    }
    public static int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
        int[] res = new int[n];
        for ( int i = 0; i < 100; i++) {
            for (int j = 0; j < n; j++) {
                int sum = (n*i)+(j+1);
                if (sum >= candies) {
                    res[j] += candies;
                    return res;
                }
                candies -= sum;
                res[j] += sum;
            }
        }
        return res;
    }
}
