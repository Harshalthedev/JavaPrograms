// import java.util.Arrays;

public class Program06 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        s = s.trim();
        String s1 = " ";
        int n = s.lastIndexOf(s1);
        System.out.println(s.length()-1 - n);
    }
}
