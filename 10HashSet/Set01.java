import java.util.HashSet;

class Set01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // insert
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(25);
          
        // delete
        set.remove(25);

        // search  true or false 
        set.contains(25);     //true
        set.contains(20);       // false

        // length
        set.size();

        // print all element in set
        System.out.println(set);

    }
}