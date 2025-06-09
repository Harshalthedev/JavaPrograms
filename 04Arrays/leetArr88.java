public class leetArr88 {
    public static void main(String[] args) {
        int[] res = rearrangeArray(new int[] {3,1,-2,-5,2,-4});
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) pos[j++] = nums[i];
            else neg[k++] = nums[i];
        }
        int[] res = new int[n];
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && a < n/2) {
                res[i] = pos[a];
                a++;
            }   
            else if (b < n/2){
                res[i] = neg[b];
                b++;
            }
            // System.out.print(res[i]+" ");
        }
        return res;
    }
}
