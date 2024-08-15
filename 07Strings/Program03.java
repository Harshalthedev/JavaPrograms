import java.util.Arrays;

public class Program03 {
    public static void main(String[] args) {
        String s1 = "HE Is aRADHYA";
        String s2 = "is he HRADAYA";

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        Boolean result = Arrays.equals(c1,c2);
        if(result == true ) {
            System.out.println(true);
        }
        else
        System.out.println(false);
    }
}
