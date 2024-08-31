import java.util.HashSet;
import java.util.Iterator;
class leetArr35 {
    public static void main(String[] args) {
        // int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        // Output: [2,2]

        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        // Output: [4,9]

                HashSet<Integer> set1 = new HashSet<>();
                HashSet<Integer> set2 = new HashSet<>();
                
                for ( int i : nums1) {
                    set1.add(i);
                }
                for ( int i : nums2) {
                    set2.add(i);
                }
                
                set1.retainAll(set2);
                
                int[] arr = new int[set1.size()];
                Iterator<Integer> it = set1.iterator();

                int i = 0;
                while ( it.hasNext()) {
                    arr[i++] = it.next();
                }

                for (int n : arr) {
                    System.out.print(n+" ");
                }

    }
}