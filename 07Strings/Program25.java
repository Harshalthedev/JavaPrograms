public class Program25 {
    public static void main(String[] args) {
        // String s = "abcabcbb";
        // String s = "bbbbb";
        String s = "pwwkew";
        StringBuilder sb = new StringBuilder();
       int presub = 0 ;
       int newsub = 0;

        for ( int i = 0 ; i < s.length() ; i++) {
            sb.append(s.charAt(i));

            if (sb.toString().indexOf(s.charAt(i)) != i) {
                System.out.println(sb.toString());
                sb.delete(0,sb.toString().length()-1);
                newsub = sb.toString().length();
                // System.out.println();
            }
            if(newsub > presub){
                int temp = newsub;
                newsub = presub;
                presub = temp;
            }
        }
        System.out.println(newsub);
        System.out.println(sb.toString());
    }
}
