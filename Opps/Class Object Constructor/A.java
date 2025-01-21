class Intro204 {
    public static void main(String[] args) {
        // Creating an object of class A
        A ob = new A(25, "Jay");
        
        // Printing the values of instance variables and static variable
        System.out.println(ob.a + " " + ob.city + " " + ob.city_code);
    }
}

class A {
    int a;               // Instance variable
    String city;         // Instance variable
    static int city_code; // Static variable

    // Constructor to initialize instance variables and static variable
    A(int a, String city) {
        this.a = a;            // Initializing the instance variable 'a'
        this.city = city;      // Initializing the instance variable 'city'
        this.city_code = 112;  // Initializing the static variable 'city_code'
    }
}
