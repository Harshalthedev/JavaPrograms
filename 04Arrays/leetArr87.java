import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetArr87 {
    public static void main(String[] args) {
        List<List<Integer>> list = findMatrix(new int[] {1,3,2,1,4,3,1});
        System.out.println(list);    
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        List<Integer> remlist = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums) {
            if (set1.contains(num)) {
                remlist.add(num);
            }
            set1.add(num);
        }
        list.add(new ArrayList<>(set1));

        while (!remlist.isEmpty()) {
            Set<Integer> set = new HashSet<>();
            List<Integer> temp = new ArrayList<>();
            for (int num : remlist) {
                if (set.contains(num)) {
                    temp.add(num);
                }
                set.add(num);
            }
            remlist = temp;
            list.add(new ArrayList<>(set));

        } 
        return list;
    }
}
