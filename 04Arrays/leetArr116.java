public class leetArr116 {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[] {1,2,2,3,3,3}));
    }
    public static int findLucky(int[] arr) {
        int[] res = new int[501];
        for (int i : arr) {
            res[i]++;
        }
        for (int i = 500; i > 0; i--) {
            if (i == res[i]) return i;
        }
        return -1;
    }
}
