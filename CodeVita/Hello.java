public class Hello {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int len = s.length()-1;
        System.out.println(len);
        while ( l < len ) {
            if ( k < len ) {
                sb.append(s.substring(l , k)).reverse();
                sb.append(s.substring(k ,  l + 2*k));
                System.out.println(sb.toString());
                l = l + 2*k;
                k = l + k;
            }
            else {
                sb.append(s.substring(l , len));
            }
            
        }
        System.out.println(sb.toString());
    }
}
