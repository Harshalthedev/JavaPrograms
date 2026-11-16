public class Program71 {
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }
    public static String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        while (sb.length() > k || first) {
            sb.delete(0, sb.length());
            first = false;
            int i = 0;
            while (i < s.length()) {
                int j = i;
                int sum = 0;
                while (j < i+k && j < s.length()) {
                    sum += s.charAt(j) - '0';
                    j++;
                }
                i = j;
                sb.append(sum);
            }
            s = sb.toString();
        } 
        return sb.toString();
    }
}
