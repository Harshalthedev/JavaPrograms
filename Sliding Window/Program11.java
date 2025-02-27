public class Program11 {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        // System.out.println(repeatedStringMatch("abcd", "cdabcdab"));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        int r = 0;
        while( l < m && r <= n) {
            if (nums1[l] < nums2[r]) {
                l++;
            }
            else if (nums1[l] > nums2[r]) {
                int temp = nums1[l];
                nums1[l] = nums2[r];
                nums2[r] = temp;
                l++;
            }
            else {
                l++;
            }
        }
        if (m < m+n) {
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums1[2];
            }
        }
        for (int i : nums1) {
            System.out.print(i+" ");
        }
    }
}
