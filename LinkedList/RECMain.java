public class RECMain {
    public static void main(String[] args) {
        SingleREC cll = new SingleREC();
        cll.insert(5);
        cll.insert(6);
        cll.insert(3);
        cll.insert(8);
        cll.insert(7);
        // cll.insertRec(0, 100);
        cll.insertRec(3, 200);
        cll.insertRec(2, 300);
        cll.display();
    }
}
