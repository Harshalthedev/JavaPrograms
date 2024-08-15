import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data:");
        LL list = new LL();
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            list.insert(a, null);
        }
        list.display();
    }
}
