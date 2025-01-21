public class Main {
    public static void main(String[] args) {
        Shape sp = new Shape();
        Circle c = new Circle();
        Square sq = new Square();
        Triangle t = new Triangle();

    //  shape is reference type and square is object type
        // Shape s = new Square();             
        // s.area();         // square method will be called due to late binding
        
    //  shape is reference type and square object type 
        Shape s1 = new Square();             
        s1.area();         // shape method will be called due to early binding
    }
}
