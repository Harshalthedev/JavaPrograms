import java.util.Scanner;

public class hackerr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            System.out.println(id+" "+name+" "+cgpa);
            sc.nextLine();
        }
        sc.close();
    }
}
