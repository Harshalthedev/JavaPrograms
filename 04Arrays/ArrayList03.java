import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {
        //divisible by 7
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int num = 0;
        while (result) {
            num = sc.nextInt();
            list.add(num);
            if (num <= 0) {
                result = false;
                list.remove(list.size()-1);
            }
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) % 7 == 0) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
    }
}
