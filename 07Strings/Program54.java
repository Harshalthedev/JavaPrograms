public class Program54 {
    public static void main(String[] args) {
        System.out.println(generatePass("hackerrank", "mountain"));
    }
    public static String generatePass(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int i = 0, j = 0;
        while (lenA > i && lenB > j) {
            sb.append(a.charAt(i++));
            sb.append(b.charAt(j++));
        }
        if (i < lenA) sb.append(a.substring(i));
        else sb.append(b.substring(j));
        
        return sb.toString();
    }
}
