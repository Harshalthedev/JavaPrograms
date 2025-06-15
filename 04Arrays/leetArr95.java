public class leetArr95 {
    public static void main(String[] args) {
        System.out.println(generateTag(" fPysaRtLQLiMKVvRhMkkDLNedQKffPnCjbITBTOVhoVjiKbfSawvpisDaNzXJctQkn"));
        
    }
    public static String generateTag(String caption) {
        String[] words = caption.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("#");

        if (words.length > 0) {
            sb.append(words[0].toLowerCase());
        }

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (word.isEmpty()) continue;

            sb.append(Character.toUpperCase(word.charAt(0)));
            if (word.length() > 1) {
                sb.append(word.substring(1).toLowerCase());
            }
        }

        if (sb.length() > 100) {
            return sb.substring(0, 100);
        }

        return sb.toString();
    }
}
