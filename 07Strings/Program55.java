public class Program55 {
    public static void main(String[] args) {
        System.out.println(seatingPlacement(4));
        System.out.println(seatingPlacement(6));
        System.out.println(seatingPlacement(9));
    }
    public static int seatingPlacement(int n) {
        int c = 1;
        int i = 2;
        while (c <= n) {
            String bi = Integer.toBinaryString(i);
            if (bi.indexOf("11") < 0) {
                c++;
                if (c == n) return Integer.parseInt(bi);
            }
            i++;
        }
        return -1;
    }
}