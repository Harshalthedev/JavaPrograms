public class Program28 {
    public static void main(String[] args) {
        // String s = "RLRRLLRLRL" ;
        String s = "LLLLRRRR" ;
        // String s = "RLRRRLLRLL" ;
        // Output: 4
        // Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of
        //  'L' and 'R'.
        int count = 0;
        int R = 0 ;
        int L = 0 ;
        for (int i = 0; i < s.length() ; i++) {
            if( s.charAt(i) == 'R') {
                R++;

            }
            if( s.charAt(i) == 'L') {
                L++;

            }
            if(R == L) {
                count++;
            }
        }
        System.out.println(count);

    }
}
