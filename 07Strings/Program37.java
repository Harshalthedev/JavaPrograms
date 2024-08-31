public class Program37 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int count = 0 ;
        for (int i = 0; i < words.length; i++) {
            if ( words[i].length() >= pref.length() && words[i].indexOf(pref) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
