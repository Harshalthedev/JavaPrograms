public class Program15 {
    public static void main(String[] args) {
        String s = "hello" ;
        int sum =  0 ;
        for ( int i = 0; i < s.length() -1; i++) {

            sum = sum + Math.abs((s.charAt(i) - s.charAt(i+1))) ;
        }
        System.out.println(sum);
    }
}
