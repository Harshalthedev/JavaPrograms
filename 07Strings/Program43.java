public class Program43 {
    public static void main(String[] args) {
        System.out.println(myAtoi("134abv"));
    }
    public static int myAtoi(String s) {
        int i = 0;
        while ( i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1; 
            i++;
        }
        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = (result*10) + (s.charAt(i) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*result);
    }
}