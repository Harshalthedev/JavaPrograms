// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Program04 {
    public static void main(String[] args) {
        String s = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";

        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        
        while ( s.contains(sb) ) {
            sb.append(word);
            count++;
        }
        
        System.out.println(count);

    }
}