import java.util.ArrayList;
import java.util.List;

public class Laval2 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<Integer> smaList = new ArrayList<>();
            for (int j = i+1; j < 6; j++) {
                smaList.add(j);
            }
            list.add(0, smaList);
        }
        System.out.println(list);
    } 
}
