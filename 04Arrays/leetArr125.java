import java.util.*;
public class leetArr125 {
    public static void main(String[] args) {
        // List<Integer> list1 = new ArrayList<>(Arrays.asList(4,5,6,7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        // System.out.println(amazon(list1));
        System.out.println(amazon(list2));
    }
    public static String amazon(List<Integer> list) {
        while(!(list.size() == 2)) {
            List<Integer> newList = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {  
                int a = list.get(i-1);
                int b = list.get(i);
                if (a > 9) {
                    a %= 10;
                }  
                if (b > 9) {
                    b %= 10;
                }
                newList.add(a+b);
            }
            list = newList;
        } 
        
        return list.get(0)%10+""+list.get(1)%10;
    }
}
