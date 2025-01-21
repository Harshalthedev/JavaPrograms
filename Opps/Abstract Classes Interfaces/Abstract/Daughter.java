public class Daughter extends Parent{
    
    Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("i am coder");
    }

    @Override
    void partner(){
        System.out.println("i love iron man");
    }
}
