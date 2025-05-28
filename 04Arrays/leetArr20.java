import java.util.ArrayList;

public class leetArr20 {
    public static void main(String[] args) {
        int[][] nums1 = {
            {1,2},
            {2,3},
            {4,5}
        };
        int[][] nums2 = {
            {1,4},
            {6,2},
            // {4,1}
        };
        // result [[1,6],[2,3],[3,2],[4,6]]
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int maxlen = Math.max(nums1.length, nums2.length);
        
        for (int i = 0; i < maxlen ; i++) {
            
            for (int j = 0; j < 1 ; j++) {
                if (nums1[i][0] == nums2[i][0]) {
                    list.add(new ArrayList<>(java.util.Arrays.asList(nums1[i][0],nums1[i][1]+nums2[i][1])));
                }
                else if (nums1[i][0] != nums2[i][0]) {
                    if(nums1[i][0] < nums2[i][0]) {
                        list.add(new ArrayList<>(java.util.Arrays.asList(nums1[i][0],nums1[i][1])));
                    }
                    list.add(new ArrayList<>(java.util.Arrays.asList(nums2[i][0],nums2[i][1])));
                }
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
