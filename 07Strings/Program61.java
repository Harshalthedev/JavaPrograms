import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program61 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);
        Set<String> set = new HashSet<>();
        set.add(list.toString());
        System.out.println(set);
    }
}
