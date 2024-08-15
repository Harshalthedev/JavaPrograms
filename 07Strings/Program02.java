import java.util.Arrays;

public class Program02 {
    public static void main(String[] args) {
        // check whether two stirngs are anagram or not (means if and only of the element in the 1st string is present in the 2nd string without preserving the order)
        String s1 = "silent";
        String s2 = "lentsi";
        if(s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
    
            Arrays.sort(c1);
            Arrays.sort(c2);
            Boolean result = Arrays.equals(c1,c2);
            if(result == true) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
        else {
            System.out.println("False");
        }
    }
}
