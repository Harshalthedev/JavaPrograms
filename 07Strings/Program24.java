import java.util.Stack;

public class Program24 {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        // For example, "m.y+name@email.com" will be forwarded to "my@email.com".
        int count = 0;
        Stack<Character> st = new Stack<>();

        for ( int i = 0 ; i < emails.length ; i++ ) {

            for ( int j = 0 ; j < emails[i].length() ; j++ ) {
                char ch = emails[i].charAt(j);
                if ( ch == '+') {
                    st.push(ch);
                }

                
            }
        }
    }
}
