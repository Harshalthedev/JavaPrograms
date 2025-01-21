import java.util.*;
public class Program19 {
    public static void main(String[] args) {
        // char ch = 'z'-97;
        // System.out.println(ch);
        letters("12", "");
    }
    static ArrayList<String> letters( String up , String p ) {
        ArrayList<String> list = new ArrayList<>();
        
        if ( up.isEmpty() ) {
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        for ( int i  = (digit-1)*3; i < digit * 3; i++ ) {
            char ch = (char) ('a' + i);
            letters(up.substring(1) , p + ch);
        } 
        return list;
    }
}
