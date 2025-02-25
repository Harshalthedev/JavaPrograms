public class Program13 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        while ( l < r) {
            char ch1 = ch[l];
            char ch2 = ch[r];
            if ((ch1 == 'A' || ch1 == 'a' ||
                 ch1 == 'E' || ch1 == 'e' ||
                 ch1 == 'I' || ch1 == 'i' ||
                 ch1 == 'O' || ch1 == 'o' ||
                 ch1 == 'U' || ch1 == 'u' ) 
                 &&
                (ch2 == 'A' || ch2 == 'a' ||
                 ch2 == 'E' || ch2 == 'e' ||
                 ch2 == 'I' || ch2 == 'i' ||
                 ch2 == 'O' || ch2 == 'o' ||
                 ch2 == 'U' || ch2 == 'u' )) {
                    
                    char temp = ch[l];
                    ch[l] = ch[r];
                    ch[r] = temp;
                    l++;
                    r--;
            }
            else if (ch1 == 'A' || ch1 == 'a' ||
                 ch1 == 'E' || ch1 == 'e' ||
                 ch1 == 'I' || ch1 == 'i' ||
                 ch1 == 'O' || ch1 == 'o' ||
                 ch1 == 'U' || ch1 == 'u' ) {
                    r--;
            }
            else l++;
        }
        return String.valueOf(ch);
    }
}
