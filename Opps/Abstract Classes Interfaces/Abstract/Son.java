public class Son extends Parent {
    
    Son(int age){
        super(age);
    }
    void print(){
        System.out.println(num);
    }
    @Override
    void career() {
        System.out.println("i am doctor");
    }

    @Override
    void partner(){
        System.out.println("i love wanda");
    }

    @Override
    void normal(){
        super.normal();
    }
}
