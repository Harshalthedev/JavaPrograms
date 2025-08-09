import java.util.Stack;

class Program01 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/.../a///../b/c/../d/./"));
        System.out.println(simplifyPath("/home/"));
        // Output : /home
        System.out.println(simplifyPath(" /a/../.././../../.")); // /a
        
        // I/nput : /a/./b/../../c/
        System.out.println(simplifyPath("/a/./b/../../c/"));
// Output : /c
    }
    public static String simplifyPath(String path) {
        path.trim();
        Stack<String> st = new Stack<>();
        String[] str = path.substring(1).split("/");
        for (String s : str) {
            if (!st.isEmpty() && s.equals("..")) 
            st.pop();
            else if (!s.equals("..") && s.length() > 2)
            st.push(s);
            else if (!s.equals("..") && !s.equals("") && !s.equals(".") ) 
            st.push(s);
        } 
        StringBuilder sb = new StringBuilder();
        for (String s : st) {
            sb.append("/").append(s);
        }
        return st.isEmpty() ? "/" : sb.toString();
    }
}