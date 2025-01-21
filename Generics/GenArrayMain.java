public class GenArrayMain {
    public static void main(String[] args) {
        GenArrayList<Integer> list = new GenArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(2*i);
        }
        System.out.println(list.get(3));
        System.out.println(list);
    }
}
