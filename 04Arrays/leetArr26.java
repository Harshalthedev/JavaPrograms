import java.util.ArrayList;
import java.util.Scanner;
public class leetArr26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>();

        boolean result = false;
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            list.add(num);
        }
        
    }
}
