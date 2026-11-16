public class Program24 {

    public static void main(String[] args) {
        subset("", "abc");
    }
    public static void subset(String up, String p) {
        if (p.length() == 0) {
            System.out.print(up+" ");
            return;
        }
        subset(up+p.charAt(0), p.substring(1));
        subset(up, p.substring(1));
    }
    
}
