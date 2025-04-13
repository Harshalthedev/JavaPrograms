public class Prog03 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 3; i*i < n; i +=2) {
            if (n%i==0) {
                return false;
            }
        }
    }
}
