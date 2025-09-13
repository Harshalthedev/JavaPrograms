public class Program51 {
    public static void main(String[] args) {
        System.out.println(maxFreqSum("successes"));
    }
    public static int maxFreqSum(String s) {
        int vovel = 0;
        int conso = 0;
        int[] alpha = new int[26];
        for (char ch : s.toCharArray()) {
            alpha[ch - 'a']++;
            if ("aeiou".indexOf(ch) > -1) vovel = Math.max(vovel, alpha[ch - 'a']);
            else conso =  Math.max(conso, alpha[ch - 'a']);
        }
        return vovel+conso;
    }
}
