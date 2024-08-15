public class stringbuilder {
    public static void main(String[] args) {
        
        String s = "harshal";

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();  
        System.out.println(sb.toString());

        // char[] ch = s.toCharArray();
        // int l = 0 ; 
        // int h = s.length()-1;
        // while (l<=h) {
        //     char temp = ch[l];
        //     ch[l] = ch[h];
        //     ch[h] = temp ;
        // }
        // for (char c : ch) {
        //     System.out.print(c+" ");
        // }
    }
}
