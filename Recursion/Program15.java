import java.util.List;
import java.util.ArrayList;

public class Program15 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerlist = new ArrayList<>();
        outerlist.add(new ArrayList<>());
        for (int num : arr) {
            int n = outerlist.size();
            for (int i = 0; i < n; i++) {
                System.out.println(outerlist.get(i));
                List<Integer> internal = new ArrayList<Integer>(outerlist.get(i));
                // System.out.println(outerlist.get(i));
                internal.add(num);
                // if (!outerlist.contains(internal)) {
                    System.out.println(internal);
                    outerlist.add(internal);
                // }
                System.out.println(outerlist);
            }
        }
        return outerlist;
    }
}
