class A {
    static int a ;
    // A(int a) {                 // it prints the output both as 20 and 20 because it is loaded only once 
    //     this.a = a;
    // }
}
public class Intro206 {
    public static void main(String[] args) {
        A ob = new A(10);
        A ob1 = new A(20);
        System.out.println(ob.a);
        System.out.println(ob1.a);
    }
}
