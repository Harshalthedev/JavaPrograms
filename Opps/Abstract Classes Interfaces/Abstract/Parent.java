public abstract class Parent{
    
    int age;
    final int num ;
    Parent(int age) {
        this.age = age;
        num = 9999;              //this cannot be overrride by the subclass but can b accessed
    }
    abstract void career();
    abstract void partner();

    
        //we cant make a parent constructer
        // Parent parent = new Parent();

    //can we create abstract static method :  NO
    //we cant overriden the static method therefore there is no point having a abstract static methods

    //we can create a static method in a abtract class
    static void name(){
        System.out.println("i am harshal");
    }

    //we can have normal method in abstract class
    void normal(){
        System.out.println("this is a normal method");
    }
}