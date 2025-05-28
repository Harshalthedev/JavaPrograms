import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class leetArr76 {
    public static void main(String[] args) {
        int[] arr = relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6});
        for (int i : arr) {
            System.out.println(i);
        };
    }
public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int num : arr1) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        int[] arr = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int freq =  map.get(arr2[i]);
            for ( int j = 0; j < freq; j++) {
                arr[k++] = arr2[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr2) {
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(list);
        for (int num : arr1) {
            if (!list.contains(num)) {
                arr[k++] = num;
            }
        }
        return arr;
    }
}
