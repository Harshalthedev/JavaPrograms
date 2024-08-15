public class leetArr18 {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode india is my country", "i think so too", "this is great thanks very much"};
        int len1 = 0;
        int len2 = 0;
        for ( int i = 0 ; i < sentences.length-1 ; i++ ){
            len1 = sentences[i].split(" ").length;
            if ( len1 > len2) {
                len2 = len1;
            }
        }
        System.out.println(len2);

    }
}