public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        System.out.println(son.age);
        son.career();
        Daughter daughter = new Daughter(19);
        daughter.career();
        System.out.println(daughter.age);
        son.normal();    //normal method from parent class
        son.print();     // can only access the final variable
    }
}
