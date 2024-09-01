
import smallPack201.Accessingpack1;
import smallPack201.Accessingpack2;

public class Intro201 {
    public static void main(String[] args) {
        Accessingpack1 obj = new Accessingpack1() ;   
        obj.Greeting();
        Accessingpack2 msg = new Accessingpack2();
        msg.message();
        
        A ob = new A("India");
        System.out.println(ob.name);

    }
}

class A {
    String name ;
    A(String name) {
        this.name = name;
    }
}
