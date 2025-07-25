import java.util.Arrays;

public class leetArr138 {
    public static void main(String[] args) {
        int[] res1 = decrypt(new int[] {5,7,1,4}, 3);
        int[] res2 = decrypt(new int[] {1,2,3,4}, 0);
        int[] res3 = decrypt(new int[] {2,4,9,3}, -2);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
    }
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        if (k > 0) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int j = i+1;
                int temp = k;
                int sum = 0;
                while (temp-- > 0) {
                    j = j % n;
                    sum += code[j++];
                }
                res[i] = sum;
            }
            return res;   
        }
        else if (k < 0) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int j = i-1;
                int temp = k;
                int sum = 0;
                while (temp++ < 0) {
                    if (j < 0) {
                        j = n-1;
                    }
                    sum += code[j--];
                }
                res[i] = sum;
            }
            return res;
        }
        int[] res = new int[n];
        return res;
    }
}
