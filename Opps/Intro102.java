public class Intro102 {
    public static void main(String[] args) {

        final A kunal = new A("Harshal");
        kunal.name = "Raj"; //this is allowed
        // kunal.name = new A("Jay");   // this is not allowed
        System.out.println(kunal.name);
        
    }    
}
class A{
    final int num = 10;
    String name;
    A(String name) {
        this.name = name;
    }
}