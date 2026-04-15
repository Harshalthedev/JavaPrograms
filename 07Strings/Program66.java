public class Program66 {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 10));
    }
    public static char findKthBit(int n, int k) {
        StringBuilder ans = new StringBuilder();
        ans.append("0");
        while (n > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = ans.length()-1; i >= 0; i--) {
                if (ans.charAt(i) == '0') sb.append("1");
                else sb.append("0");
            }
            ans.append("1").append(sb);
            n--;
        }
        return ans.charAt(k-1);
    }
    
}