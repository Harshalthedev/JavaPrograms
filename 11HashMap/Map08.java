import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map08 {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};
        int[][] res = mergeArrays(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i1 = 0;
        int i2 = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while ( i1 < len1 && i2 < len2) {
            int num1 = nums1[i1][0];
            int num2 = nums2[i2][0];
            if (num1 == num2) {
                map.put(num1, nums1[i1][1]+nums2[i2][1]);
                i1++;
                i2++;
            }
            else if ( num1 < num2) {
                map.put(num1, nums1[i1][1]);
                i1++;
            }
            else {
                map.put(num2, nums2[i2][1]);
                i2++;
            }
        }
        while (i1 < len1) {
            int num1 = nums1[i1][0];
            map.put(num1, nums1[i1][1]);
            i1++;
        }
        while (i2 < len2) {
            int num2 = nums2[i2][0];
            map.put(num2, nums2[i2][1]);
            i2++;
        }
        int[][] res = new int[map.size()][2];
        int i = 0;
        for ( int num : map.keySet()) {
            res[i][0] = num;
            res[i][1] = map.get(num);
            i++;
        }
        return res;
    }
}
