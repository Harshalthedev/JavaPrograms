// import java.util.Arrays;

public class Program12 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3" ;
        String[] str = s.split(" ");
        // Arrays.sort(str.isdigit());
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
