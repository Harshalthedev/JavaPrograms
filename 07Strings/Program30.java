public class Program30 {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        StringBuilder sb = new StringBuilder();
        for(int i= 0 ; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(j > 0 || words[i].indexOf(words[i].charAt(j)) > sb.toString().length()-1) {
                    sb.append(words[i].charAt(j));
                }
            }
            words[i] = sb.toString();
            sb.delete(0, sb.toString().length());
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
    }
}
