public class Program31 {
    public static void main(String[] args) {
        // String s = "leEeetcode";
        String s = "abBAcC";
        StringBuilder sb = new StringBuilder();
        String s1 = s.toLowerCase();
        int n = s1.length();
        // int count = 0 ;
        boolean result = true;
        // while (result) {
            for(int i = 0 ; i < n-1 ; i++ ) {
                if( s1.charAt(i) != s1.charAt(i+1) ) {
                    sb.append(s1.charAt(i));
                    sb.append(s1.charAt(i+1));
                    i++;
                }
                // if (s.charAt(i+1) == s.charAt(i+2)) {
                //     sb.deleteCharAt(i+1);
                //     i++;
                // }
                // else {
                //     if (s1.charAt(i) == s1.charAt(i+1)) {
                //         result = true;
                //     }
                //     else result = false;
                // }
            }
            // n = sb.toString().length();
        // } 
        System.out.println(sb.toString());
    }
}
