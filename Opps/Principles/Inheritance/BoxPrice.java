public class BoxPrice extends BoxWeight {
    int price;

    public BoxPrice() {
        super();
        this.price = -1;
    }

    // BoxPrice (BoxPrice other) {
    //     super(other);
    //     this.price = other.price;

    // }
    public BoxPrice (double l ,double h , double w , double weigth, int price) {
        super(l,w,h,weigth);
        // System.out.println(super.price);
        this.price = price;
        
    }
}
