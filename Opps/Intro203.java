
public class Intro203 {
    public static void main(String[] args) {

        fun2(); // here fun2 is 


        Intro203 obj = new Intro203();
        obj.fun();
    }    
    static void fun2() {
        Intro203 obj2 = new Intro203();
        obj2.greeting();
    }
    void fun() {

        greeting();
    }
    void greeting() {
        System.out.println("hello");
    }
}
