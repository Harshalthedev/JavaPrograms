public class Main2 {
    public static void main(String[] args)
    {
        /*1.string pool :- diffrent reference variable points to the same objects
          2.imutability :- we cant change the objects but we can create the new objects.
          now,  1. String a = "harshal";
                   String b = "harshal";
                2. String a "harshal";
                          a = "kunal";
         */
        /* comparison in strings
         *  ==
        */
        String a = "harshal";
        String b = "harshal";
        // a = "jay";
        // System.out.println(a);
        System.out.println(a==b);      // the answer is true because they are in the string pool 

        // now , they are in heap and outside heap
        String m = new String("harsh");
        String n = new String("harsh");
        System.out.println(m == n);   // it will print false as they are outside the pool and  not pointing eachother
        System.out.println(m.equals(n));  // inbuilt methods in java it will print true
    }
}
