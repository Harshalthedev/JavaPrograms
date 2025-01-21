public class CircuMain {
    public static void main(String[] args) {
        Circular cll = new Circular();
        cll.insert(5);
        cll.insert(6);
        cll.insert(3);
        cll.insert(8);
        cll.insert(7);
        cll.display();
        System.out.println();
        cll.deletionVALUE(8);
        cll.display();
    }
}
