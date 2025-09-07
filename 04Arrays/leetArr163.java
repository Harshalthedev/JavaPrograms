import java.util.Arrays;
import java.util.List;

public class leetArr163 {
    public static void main(String[] args) {
        List<String> result = Arrays.asList("Hello", "World", "in", "a", "frame");
        result = result.subList(0, 2+1);
        System.out.println(result);
    }
}
