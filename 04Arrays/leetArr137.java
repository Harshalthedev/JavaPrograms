public class leetArr137 {
    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("aAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("c"));
        System.out.println(longestNiceSubstring("dDzeE"));
        System.out.println(longestNiceSubstring("VvWLNEne"));
    }
    public static String longestNiceSubstring(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            boolean[] lowChar = new boolean[26];
            boolean[] upperChar = new boolean[26];
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (Character.isUpperCase(ch)) {
                    upperChar[ch - 'A'] = true;
                }
                else {
                    lowChar[ch - 'a'] = true;
                }
                sb.append(ch);
                boolean nice = false;
                for (int k = 0; k < sb.length(); k++) {
                    if (lowChar[Character.toLowerCase(sb.charAt(k)) - 'a'] && 
                    upperChar[Character.toUpperCase(sb.charAt(k)) - 'A']) {
                        nice = true;
                    }
                    else {
                        nice = false;
                        break;
                    }
                } 
                if (nice && res.length() < sb.length()) {
                    res = sb.toString();
                }
            }
        }
        return res;
    }
}
