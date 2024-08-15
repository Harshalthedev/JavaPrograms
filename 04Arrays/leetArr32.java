import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
public class leetArr32 {
    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3,1};
        // int[] nums1 = {1,1,3,2};
        // int[] nums2 = {2,3};
        // int[] nums3 = {3};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        HashSet<Integer> set4 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums3) {
            set3.add(i);
        }
        set2.retainAll(set3);
        set4.addAll(set);
        set.retainAll(set2);
        // set4.addAll(set);
        // set2.retainAll(set3);
        // set4.addAll(set2);
        // set.retainAll(set3);
        // set4.addAll(set);

        System.out.println(set);
        
    }
}