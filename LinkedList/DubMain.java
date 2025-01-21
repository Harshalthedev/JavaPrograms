import java.util.ArrayList;
public class DubMain {
    public static void main(String[] args) {
        RemoveDub cll = new RemoveDub();
        cll.insert(5);
        cll.insert(6);
        cll.insert(6);
        cll.insert(6);
        cll.insert(8);
        cll.insert(7);
        cll.insert(7);
        cll.insert(7);
        cll.insert(10);
        cll.display();
        System.out.println();
        cll.removedub();
        cll.display();
    }
}
