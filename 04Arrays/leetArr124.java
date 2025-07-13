import java.util.ArrayList;
import java.util.List;

public class leetArr124 {
    public static void main(String[] args) {
        int n = 7;
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer> prevlist = triangle.get(i-1);
            List<Integer> newlist = new ArrayList<>();
            newlist.add(1);
            for (int j = 1; j < i; j++) {
                newlist.add(prevlist.get(j-1)+prevlist.get(j));
            }
            newlist.add(1);
            triangle.add(newlist);
        }
        System.out.println(triangle);
    }
}
