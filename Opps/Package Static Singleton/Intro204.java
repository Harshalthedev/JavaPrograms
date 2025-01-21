public class Intro204 {
    // initializing static variable
    public static void main(String[] args) {
        System.out.println(Human.city);

    }
}
class Human {
    int a;
    String n ;
    static String city = "Mumbai";   // here we are directly initializing
    Human(int a, String n) {
        this.a = a;
        this.n = n;
    } 
}