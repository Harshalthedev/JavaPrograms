import java.util.Arrays;
public class leetArr34 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length-1;
        int n2 = nums1.length-1;
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        int minElement = Math.min(nums1[n1], nums2[n2]);
        for (int i : nums2) {
            
        }

    }
}
