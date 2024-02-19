public class Pritnf {
    public static void main(String[] args)
    {
        float a = 25.26542f;
        // %.2f is used the access only 2 decimal values and roundoff 
        System.out.printf("the Formatted number is: %.3f ",a);
        System.out.println();
        System.out.print(Math.PI);
        System.out.println();
        System.out.printf("Pie: %.2f",Math.PI);
        System.out.println();
        String s = "harshal";
        System.out.printf("Formated is: %.5s",s);
        System.out.println();
        System.out.printf("hello i am %s and i am %s","harshal","cool");

    }
}
