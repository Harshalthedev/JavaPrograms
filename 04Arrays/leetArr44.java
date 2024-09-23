public class leetArr44 {
    public static void main(String[] args) {
        String s = "a good   example";
        StringBuilder sb = new StringBuilder();
        String[] sentence = s.split("\\s+");
        for (int i = sentence.length-1; i >= 0; i--) {
            sb.append(sentence[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }    
}
