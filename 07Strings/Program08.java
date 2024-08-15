public class Program08 {
    public static void main(String[] args) {
        // print even words
        String str = "Hell World";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].length() % 2 == 0) {
                System.out.println(s[i]);
            }
        }

        // for (String s : str.split(" ")) {
        //     if(s.length() % 2 == 0) {
        //         System.out.println(s);
        //     }
        // }
    }
}
