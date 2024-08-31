import java.util.HashSet;
import java.util.Iterator;

public class leetArr37 {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1}, nums2 = {2,2,5,2,3,6};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] arr = new int[2];

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        System.out.println(set1);
        System.out.println(set2);

        int count1 = 0;
        int count2 = 0;

        for (int i : nums1) {
            if (set2.contains(i)){
                count1++;
            }
        }
        for (int i : nums2) {
            if (set1.contains(i)){
                count2++;
            }
        }

        arr[0] = count1;
        arr[1] = count2;
        System.out.println(arr[0]+" "+arr[1]);
    }
}
