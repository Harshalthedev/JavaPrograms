public class permutation {
    public static void main(String[] args) {
        // permu("", "abc");
        subset("", "abc");
    }
    public static void subset(String up,String p) {
        if (p.isEmpty()) {
            System.out.println(up);
            return;
        }
        char ch = p.charAt(0);
        subset(up+ch, p.substring(1));
        subset(up, p.substring(1));

    }
    public static void permu(String up, String p) {
        if (up.length() == 3) {
            System.out.println(up);
            return;
        }
        char ch = p.charAt(0);
        for (int i = 0; i <= up.length(); i++) {
            permu(up.substring(0, i)+ch+up.substring(i, up.length()), p.substring(1));
        }
    }
}
