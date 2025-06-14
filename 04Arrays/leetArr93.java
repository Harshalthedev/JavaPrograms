public class leetArr93 {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
        System.out.println(minMaxDifference(90));
    }
    public static int minMaxDifference(int num) {
        String nStr = Integer.toString(num);
        int i = 0;
        char c = nStr.charAt(0);
        if (nStr.charAt(0) == '9') {
            for (; i < nStr.length();i++) {
                if (nStr.charAt(i) != '9') {
                    c = nStr.charAt(i);
                    break;
                }
            }
        }
        System.out.println();
        StringBuilder maxStr = new StringBuilder();
        for (char ch : nStr.toCharArray()) {
            if (c == ch) maxStr.append('9');
            else maxStr.append(ch);
        }

        StringBuilder minStr = new StringBuilder();
        for (char ch : nStr.toCharArray()) {
            if (nStr.charAt(0) == ch) minStr.append('0');
            else minStr.append(ch);
        }
        int a = Integer.parseInt(maxStr.toString());
        int b = Integer.parseInt(minStr.toString());
        System.out.println(a+" "+b);
        return a - b;
    }
}
