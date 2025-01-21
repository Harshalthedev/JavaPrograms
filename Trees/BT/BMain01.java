import java.util.Scanner;
public class BMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree01 bt = new BinaryTree01();
        bt.populate(scanner);
        bt.display();
        System.out.println(bt.leafsum());
    }
}
