import java.util.HashSet;

public class leetSet01 {
    public static void main(String[] args) {
        Integer[] nums1 = {1,2,2,1};
        Integer[] nums2 = {2,2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for ( int i = 0 ; i < nums1.length ; i++ ){
            set1.add(nums1[i]);
        }
        for ( int i = 0 ; i < nums2.length ; i++ ) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] arr = new int[set2.size()];
        int index = 0 ;
        for ( int i  : set2) {
            arr[index++] = i ; 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}