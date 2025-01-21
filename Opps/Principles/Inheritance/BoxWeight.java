public class BoxWeight extends Box {

    double weigth;
    public BoxWeight () {
        // super();
        this.weigth = 63;
    }
    // public BoxWeight(BoxWeight other) {
    //     this.weigth = weigth;
    // }

    public BoxWeight (double l ,double h , double w , double weigth) {
        super(l ,h ,w);  // it call the parent class constructor
        // it is used to initialize the values present in the constructors

        // System.out.println(super.weigth);     // here that weight exixt in both child class and parent class therefore to specifically access the member of parent class we use super keyword

        this.weigth = weigth;
    }
    
}
