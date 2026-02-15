public class Program15 {
    public static void main(String[] args) {
        // System.out.println(largestEven("1221"));
        // System.out.println(largestEven("122"));
        // System.out.println(largestEven("1333777"));
        System.out.println(largestEven("1"));
    }
    public static String largestEven(String s) {
        int n = s.length()-1;
        int i = n;
        for (; i >= 0; i--) {
            int num = s.charAt(i) - '0';
            if (num % 2 == 0) break;
        }
        // if (i < 0) return "";
        return s.substring(0, i+1);
    }
}
