import java.util.ArrayList;

class Program17 {
    public static void main(String[] args) {
        String s = "abc";
        // permutation(s , "" );
        // System.out.println(permutationRet(s , "" ));
        System.out.println(permuRetCount(s , "" ));
    }
    static void permutation(String up , String p ) {
        if ( up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutation(up.substring(1), f + ch + s);   
        }

    }
    static ArrayList<String> permutationRet(String up , String p) {
        ArrayList<String> list = new ArrayList<>();
        if ( up.isEmpty() ) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutationRet(up.substring(1), f+ch+s));
        }
        return list;
    }
    // static int count = 0;
    static int permuRetCount(String up , String p) {
        if ( up.isEmpty() ) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permuRetCount(up.substring(1), f+ch+s);
        }
        return count;
    }
}
