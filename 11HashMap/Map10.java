import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Map10 {
    public static void main(String[] args) {
        System.out.println(groupThePeople(new int[] {3,3,3,3,3,1,3}));
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int n = groupSizes.length;
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                for (int j = 0; j < n; j++) {
                    if (smallList.size() < groupSizes[i]
                            && !(set.contains(j))
                            && groupSizes[i] == groupSizes[j]) {
                        set.add(j);
                        smallList.add(j);
                    } else if (smallList.size() >= groupSizes[i])
                        break;
                }
                list.add(new ArrayList<>(smallList));
                smallList.clear();
            }
        }
        return list;
    }
}
