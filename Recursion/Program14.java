import java.util.ArrayList;
public class Program14 {
public static void main(String[] args) {
        String s ="abc";
        // subset(s, "", new ArrayList<>());
        // System.out.println();
        System.out.println(subset(s, "", new ArrayList<>()));
    } 
    static ArrayList<String> subset(String s, String s1, ArrayList<String> list){
        if (s.isEmpty()) {
            list.add(s1);
            return list;
        }
        char ch = s.charAt(0);
        subset(s.substring(1), s1+ch, list);
        subset(s.substring(1), s1, list);
        return list;
    }
}

