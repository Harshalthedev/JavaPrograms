import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Set02 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(7);
        set.add(6);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(6);
        set1.add(7);
        set1.add(1);
        set1.add(0);

        System.out.println(set);
        System.out.println(set1);
        
        // set.clear();                   // empty the set
        // System.out.println(set);       

        // set.retainAll(set1);           //intersection
        // System.out.println(set);

        // ArrayList<Integer> list = new ArrayList<>();   //
        // Iterator<Integer> it = set.iterator();
        // while (it.hasNext()) {
        //     list.add(it.next());
        // }
        // System.out.println(list);                              
    }
}