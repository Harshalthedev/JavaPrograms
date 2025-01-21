class Intro207 {
    public static void main(String[] args) {
        // Intro208 ob = new Intro208();    here i cannot access the singlrton class cause it private
        Intro208 obj = Intro208.getInstance();

        Intro208 obj2 = Intro208.getInstance();     
        Intro208 obj3 = Intro208.getInstance();

        //all this refernce variable are pointing to same object
    }
}