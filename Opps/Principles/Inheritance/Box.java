class Box {
    // private double l = -1;  //this is private sio cant be use in another file
     double l = -1;  
    double h = -1;
    double w = -1;
    double weigth = 99;
    int price =500;

    Box() {
        this.h = h;
        this.l = l;
        this.w = w;
        this.price = price;
    }

    Box( double size ) {
        this.l = size;
        this.h = size;
        this.w = size;
    }

    Box( double l , double h , double w) {
        this.h = h;
        this.l = l;
        this.w = w;
        // this.price = price;
    }

    Box ( Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    // Box ( Box price) {
    //     this.p = price.p;
    // }
    
}