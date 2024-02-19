// import java.util.Scanner;

public class Prog_6 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        PritnNos(5);
        // sc.close();
    }
    public static void PritnNos(int n) {
        if(n == 0) {
            return;
        }
        PritnNos(n-1);
        System.out.print(n+" ");
    }
}
