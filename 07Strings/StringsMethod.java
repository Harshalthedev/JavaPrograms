// import java.util.Arrays;

public class StringsMethod {
    public static void main(String[] args) {

        // // concatenation
        // String a  = "harri";
        // String b = "om";
        // System.out.println(a.concat(b));    // this is used to join two strings

        // // Substring
        // String name = "Engineering";
        // System.out.println(name.substring(0,5));

        // // Character index
        // String n = "Harshal";
        // System.out.println(n.charAt(3));    // this method is used to get the index element
        // System.out.println(Arrays.toString(n.toCharArray())); // converts string into the char array 

        // // 1.Equals method
        // String s1 = "india";
        // String s2 = "india";
        // System.out.println(s1.equals(s2));   //prints true 
        // String s3 = "INDIA";
        // System.out.println(s2.equals(s3));          // prints fasle  
        // System.out.println(s2.equalsIgnoreCase(s3));    //prints true as it ignore the case

        // // 2.Compareto() method
        // // it works on the lexicographical order that is alphabetical order
        // String s4 = "harsh";
        // String s5 = "harsh";
        // String s6= "harry";
        // System.out.println(s4.compareTo(s5));     //it returns 0 
        // System.out.println(s4.compareTo(s6));     //it returns 1  (because s4>s5)
        // System.out.println(s6.compareTo(s5));     //it returns 0 (because s6>s5)

        //replace()
        String s7 = "Java is a programming language. Java is a platform. Java is an Island."; 
        String s8 = s7.replace("Java","kawa");
        System.out.println(s8);
    }
}
