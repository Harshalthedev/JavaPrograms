import java.util.ArrayList;
import java.util.Scanner;
class ArrayListExamp01
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
         
        list.add(57);
        list.add(256);       //add is key word which add the element in the list
        list.add(457);
        list.add(542);
        list.add(78);
        list.add(563);
        list.add(412);
        list.add(100);
        list.add(586);
        list.add(354);
        list.add(647);
        list.add(10);
        list.add(56);
        list.add(54);
        list.add(47);

        System.out.println(list);
        // System.out.println(list.contains(412));       //it shows that the given no. is present or not
        // System.out.println(list.set(2, 25));
        System.out.println(list.get(5));
        // System.out.println(list.remove(3));

        // System.out.println(list);
        in.close();

        // ArrayList<Integer> listing = new ArrayList<>(10);
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(list.add(in.nextInt()));
        // }
        //     // for(int i=0;i<5;i++)
        //     // {
        //     System.out.println(list);
        //     in.close();
            // }
    }
}
    

