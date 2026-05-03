public class Program25 {
    public static void main(String[] args) {
        permutation("", "abc");
    }
    public static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            permutation(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
        }
    }
}
