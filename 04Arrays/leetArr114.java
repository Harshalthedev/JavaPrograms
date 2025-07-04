public class leetArr114 {
    public static void main(String[] args) {
        // System.out.println(kthCharacter(10, new int[] {0,1,0,1}));
        // System.out.println(kthCharacter(2, new int[] {0}));
        System.out.println(kthCharacter(28809802, new int[] {1,0,0,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,1,1}));
    }
    public static char kthCharacter(long k, int[] operations) {
        StringBuilder sb = new StringBuilder("a");
        int i = 0;
        while (sb.length() < k) {
            if (operations[i] == 0) {
                sb.append(sb.toString());
                i++;
            }
            else {
                int n = sb.length();
                for (int j = 0; j < n; j++) {
                    char ch = sb.charAt(j);
                    if (ch == 'z') sb.append('a');
                    else sb.append(++ch);

                }
                i++;
            }
        }
        return sb.charAt((int) k-1);
    }
}
