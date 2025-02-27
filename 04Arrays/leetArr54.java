public class leetArr54 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( ch == '0') {
                sb.append("1");
            }
            else {
                sb.append("0");
            }
        }
        System.out.println("string "+ sb.toString());
        num = Integer.parseInt(sb.toString());
        System.out.println(num);
        int temp = num;
        int dec = 0;
        int base = 1;
        while ( temp > 0) {
            int last_digit = temp % 10;
            dec += last_digit * base;
            base = base *2;
            temp /= 10;
        }
        return dec;
    }
}

