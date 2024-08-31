public class Program36 {
    public static void main(String[] args) {
        String sequence = "ababc", word = "ab";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append(sequence.substring(0, word.length()-1));
        System.out.println(sb.toString());
        for ( int i = 0 ; i <= sequence.length()-word.length() ; i++ ) {
            sb.append(word.length()+1);
            System.out.println(sb.toString());
            if ( sb.toString().equals(word)) {
                count++;
            }
            sb.deleteCharAt(0);
        }
        System.out.println(count);    
    }
}
