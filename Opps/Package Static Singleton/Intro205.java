public class Intro205 {

    static int a = 10;
    static int b;
    static {                  //this is a static block
        System.out.println("hello i am in static block");
        b = a *10;
    }

    public static void main(String[] args) {
        Intro205 ob1 = new Intro205();              //this load the static block
        System.out.println(Intro205.b);
        b += 10;
        Intro205 ob2 = new Intro205();              //this load the static block
        System.out.println(b);
    }
}
