import java.util.Arrays;

class leetArr185 {
    public static void main(String[] args) {
        // System.out.println(kaiden(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(Arrays.toString(merge(new int[] {1, 3, 5, 7}, new int[] {2, 4, 6, 8})));
    }
    public static int[] merge(int[] nums1, int[] nums2) {
        int l = 0;
        int r = 0;
        int[] res = new int[nums1.length+nums2.length];
        int i = 0;
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] < nums2[r]) {
                res[i] = nums1[l];
                l++;
            }
            else {
                res[i] = nums2[r];
                r++;
            }
            i++;
        }
        if (l < nums1.length) {
            for (int k = l; k < nums1.length; k++) {
                res[i] = nums1[k];
                i++;
            }
        }
        else if (r < nums2.length) {
            for (int k = r; k < nums2.length; k++) {
                res[i] = nums2[k];
                i++;
            }
        }
        return res;
    }
    public static int kaiden(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum+nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}