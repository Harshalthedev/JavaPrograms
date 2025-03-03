import java.util.Arrays;

public class leetArr63 {
    public static void main(String[] args) {
        int[] res = pivotArray(new int[] {9,12,5,10,14,3,10}, 10);
        System.out.println(Arrays.toString(res));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
         int n = nums.length;
        int[] res = new int[n];
        int pivotCount = 0;
        int i = 0;
        for (int num : nums) {
            if ( num < pivot) {
                res[i++] = num;
            }
            if (pivot == num) pivotCount++;
        }
        for ( int i1 = 0; i1 < pivotCount; i1++) {
            res[i++] = pivot;

        }
        for (int num : nums) {
            if ( num > pivot) {
                res[i++] = num;
            }
        }
        return res;
    }
}
