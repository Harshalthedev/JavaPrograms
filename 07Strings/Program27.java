import java.util.Arrays;

class Program27 {
    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        StringBuilder sb = new StringBuilder(s).reverse();
        // StringBuilder sb1 = new StringBuilder();

            String[] str = sb.toString().split(" ");
            sb.delete(0, sb.toString().length());
            for (int i = str.length-1; i >=0; i--) {
                sb.append(str[i]+" ");
            }
            System.out.println(sb.toString().trim());

               
    }   
}