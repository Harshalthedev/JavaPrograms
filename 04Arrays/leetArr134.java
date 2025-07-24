public class leetArr134 {
    public static void main(String[] args) {
        System.out.println(findLength(new int[] {1,2,3,2,1}, new int[] {3,2,1,4,7})); // 3
        System.out.println(findLength(new int[] {0,0,0,0,0}, new int[] {0,0,0,0,0})); // 5
        System.out.println(findLength(new int[] {0,0,0,0,0,0,1,0,0,0}, new int[] {0,0,0,0,0,0,0,1,0,0})); // 9
        System.out.println(findLength(new int[] {0,1,1,1,0}, new int[] {1,1,1,1,1})); // 9
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int max = 0;
        for (int i = 0; i < n1; i++) {
            max = Math.max(max, maxLen(nums1, i, nums2, 0));
        }
        for (int i = 0; i < n2; i++) {
            max = Math.max(max, maxLen(nums2, i, nums1, 0));
        }
        return max;
    }
    public static int maxLen(int[] A, int i, int[] B, int j) {
        int count = 0;
        int max = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                count++;
                                max = Math.max(max, count);

            }
            else count = 0;
            i++;
            j++;
        }
        return max;
    }
}
