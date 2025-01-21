public class Main {

    public static void main(String[] args) {
        // Box box1 = new Box();
        // Box box1 = new Box(5);
        // Box box1 = new Box(5.0,2.3,4.2);
        // Box box2 = new Box(box1);
        // System.out.println( box2.h +" "+box2.w);    //here we cant use box2.l cause l is private

        // BoxWeight box3 = new BoxWeight();
        // System.out.println((box3.w+" "+box3.weigth));

        // BoxWeight box4 = new BoxWeight(2.0,3.0,6.0,26);
        // System.out.println(box4.l+" "+box4.h+" "+box4.w+" "+box4.weigth);

        // Box box5 = new BoxWeight();
        // System.out.println(box5.weigth);

        Box box6 = new BoxPrice();
        System.out.println(box6.price);
        System.out.println(box6.weigth);
    }
    
}
