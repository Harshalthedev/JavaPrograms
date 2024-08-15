import java.util.Stack;

public class Program05 {
    public static void main(String[] args) {
        String str = "[}";
        Stack<Character> st = new Stack<>();
        boolean isWellFormed = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else if (ch == ']' || ch == '}' || ch == ')') {
                if (st.empty() || !isMatchingPair(st.peek(), ch)) {
                    isWellFormed = false;
                    break;
                } else {
                    st.pop();
                }
            }
        }

        if (isWellFormed && st.empty()) {
            System.out.println("well formed");
        } else {
            System.out.println("not well formed");
        }
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}