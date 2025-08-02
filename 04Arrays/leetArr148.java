import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetArr148 {
    public static void main(String[] args) {
        System.out.println(finalPositionOfSnake(2, new ArrayList<>(Arrays.asList("RIGHT","DOWN"))));
    }
    public static int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String command : commands) {
            if (command.equals("RIGHT")) {
                j++;
            } 
            else if (command.equals("LEFT")) {
                j--;
            } 
            else if (command.equals("UP")) {
                i--;
            } 
            else {
                i++;
            } 
        }
        return (i * n) + j;
    }
}
