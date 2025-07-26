public class Program45 {
    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[] {8, 13, 15}));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i = 0; i < spaces.length; i++) {
            sb.append(s.substring(start, spaces[i])).append(" ");
            start = spaces[i];
        }
        sb.append(s.substring(spaces[spaces.length-1], s.length()));
        return sb.toString();
    }
}
