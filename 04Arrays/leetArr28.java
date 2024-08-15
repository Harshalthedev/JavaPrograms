import java.util.ArrayList;

public class leetArr28 {
    public static void main(String[] args) {

        int[] nums2 = {2,2,1};
        int[] nums1 = {1,2,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if ( nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                }
                for (int j2 = 0; j2 < list.size(); j2++) {
                    if (list.get(j2) == nums2[i]) {
                    list.remove(list.size()-1);
                    }
                }   
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
            System.out.print(arr[i]+" ");
        }        
    }
}