public class Hello {
    public static void main(String[] args) {
        int num = 9669;
        StringBuilder sb = new StringBuilder(num+"");
        System.out.println(sb.toString());
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break; // Change only the first '6' to '9'
            }
        }
        String s = sb.toString();
        int n = Integer.parseInt(s);
        System.out.println(n);
    }
}
