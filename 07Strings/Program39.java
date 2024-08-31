public class Program39 {
    public static void main(String[] args) {
        String sentence = "  Hello3   World  ";

        String s = sentence.replaceAll("\\s+" , " ");
        s.trim();
        System.out.println(s);
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
        boolean result = true;
        int count = 0;
        for ( int i = 0 ; i < s1.length ; i++ ) {
            for ( int j = 0 ; j < s1[i].length() ; j++ ) {
                if ( !(s1[i].charAt(j) >= 'a') && !(s1[i].charAt(j) <= 'z') ) {
                    result = false;
                }
            }
            if ( result == true ) {
                count++;
            }
            result = true;
        }
        System.out.println(count);
    
    }
}
