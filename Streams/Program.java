import java.util.Arrays;
import java.util.List;

class Program {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        values.forEach( i -> System.out.println(i));
    }
}