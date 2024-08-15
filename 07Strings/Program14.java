public class Program14 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010" } ;
        int count  = 0;
        for (int i = 0; i < details.length; i++) {
            int n = Integer.parseInt(details[i].substring(11,13));
            // System.out.println(n);
            if ( n > 60) {
                count++ ;
            }
        }
        System.out.println(count);
    }
}
