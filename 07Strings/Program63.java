class Program63 {
    public static void main(String[] args) {

        System.out.println(hasSameDigits("3902"));
    }
    public static boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            String s1 = "";
            for (int i = 1; i < s.length(); i++) {
                char ch1 = s.charAt(i-1);
                char ch2 = s.charAt(i);
                int n = ((ch1 - '0') + (ch2 - '0')) % 10;
                s1 += n;
            }
            s = s1;
        }
        return s.charAt(0) == s.charAt(1);
    }
}