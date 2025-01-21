public class PowerEngine implements Engine {
    @Override
    public void start(){
        System.out.println("powerEngine start");
    }
    @Override
    public void acc(){
        System.out.println("powerEngine acc");
    }
    @Override
    public void stop(){
        System.out.println("powerEngine stop");
    }
}