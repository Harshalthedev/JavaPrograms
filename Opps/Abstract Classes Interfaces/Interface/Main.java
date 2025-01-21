public class Main {
    public static void main(String[] args) {
        // Engine car = new Car();
        // car.brake();       //we can see here we cantr access brake it doest exist in Engine
        // car.start();
        // car.stop();
        // car.acc();

    //     Media carMedia = new CDmedia();
        // carMedia.stop();
        NiceCar car = new NiceCar();

        car.start();
        car.stop();
        car.startmusic();
        System.out.println();
        car.UpgardeEngine();
        car.start();

    }
}
