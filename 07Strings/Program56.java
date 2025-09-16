public class Program56 {
    public static void main(String[] args) {
        System.out.println(minFreCharacter("Aabca0AbZZ"));
    }
    public static Character minFreCharacter(String s) {
        int[] num = new int[10];
        int[] charac = new int[52];

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                num[ch - '0']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                charac[ch - 'a']++;
            }
            else charac[ch - 'A' + 26]++;
        }

        int min = Integer.MAX_VALUE;
        for (int n : num) {
            if (n > 0)  min = Math.min(min, n);
        }
        for (int ch : charac) {
            if (ch > 0)  min = Math.min(min, ch);
        }
        for(char ch : s.toCharArray()){
            if (ch >= '0' && ch <= '9') {
                if (min == num[ch - '0']) return ch;
            }
            else if (ch >= 'a' && ch <= 'z') {
                if(min == charac[ch - 'a']) return ch;
            }
            else if (ch >= 'A' && ch <= 'Z'){
                if (min == charac[ch - 'A' + 26]) return ch;
            }
        }
        return '0';
    }
}
