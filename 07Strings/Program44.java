public class Program44 {
    public static void main(String[] args) {
        // System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));   
        // System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b'}));   
        System.out.println(compress(new char[]{'a','b','c'}));   
    }
    public static int compress(char[] chars) {
        if (chars.length == 1) return 1;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i-1] != chars[i]) {
                if(count <= 1) sb.append(chars[i-1]);
                else sb.append(chars[i-1]).append(count);
                count = 1;
            }
            else count++;
        }
        sb.append(chars[chars.length-1]);
        if (count > 1) sb.append(count);
        int n = sb.length();
        String s = sb.toString();
        System.out.println(s);
        for (int i = 0; i < n; i++) {
           char ch = s.charAt(i);
           chars[i] = ch;
        }
        return sb.length();
    }

}
