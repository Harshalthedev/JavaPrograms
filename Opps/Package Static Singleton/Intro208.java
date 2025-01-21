public class Intro208 {
    // private Intro208() {                           //here it is private so can be accesed by another class
    //     System.out.println("hello");
    // }
    // private void Hello() {                       // this method is aslo not accesible due private modifier
    //     System.out.println("hello i am from another class");
    // }

    private Intro208 () {

    }

    private static Intro208 instance ;                //this is only one instance

    public static Intro208 getInstance() {             // this functioon will make only one instance
        if ( instance == null) {
            instance = new Intro208();
        }
        return instance;
    }


}
