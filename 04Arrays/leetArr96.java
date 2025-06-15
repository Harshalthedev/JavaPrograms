public class leetArr96 {
    public static void main(String[] args) {
        System.out.println(maxDiff(123456));
        System.out.println(maxDiff(555));
        System.out.println(maxDiff(9));
    }
    public static int maxDiff(int num) {
        StringBuilder a = new StringBuilder();
        String Str = Integer.toString(num);
        int i = 0;
        char ch = Str.charAt(0);
        for (; i < Str.length(); i++) {
            if (Str.charAt(i) != '9') {
                ch = Str.charAt(i);
                break;
            }
            else a.append('9');
        }
        for (; i < Str.length(); i++) {
            if (ch == Str.charAt(i)) {
                a.append('9');
            }
            else a.append(Str.charAt(i));
        }
        StringBuilder b = new StringBuilder();
        int j = 0;
        char ch2 = Str.charAt(0);
        for (; j < Str.length(); j++) {
            if (Str.charAt(j) != '1') {
                ch2 = Str.charAt(j);
                break;
            }
            else b.append('1');
        }
        for (; j < Str.length(); j++) {
            if (j > 0 && Str.charAt(j) == ch2) {
                b.append('0');
            }
            else b.append(Str.charAt(j));
        }
        int num1 = Integer.parseInt(a.toString());
        int num2 = Integer.parseInt(b.toString());
        return num1-num2;
    }
}
