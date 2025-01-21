import java.util.Scanner;
public class LvlSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LavalSum ls = new LavalSum();
        int[] arr = {1,2,3,4,5,6,7};
        ls.insert(scanner);
        // ls.insert(arr);
        ls.displaytree();
        System.out.println(ls.maxLevelSum());
    } 
}
