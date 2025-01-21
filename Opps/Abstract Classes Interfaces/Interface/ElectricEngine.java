public class ElectricEngine implements Engine{
    public void start(){
        System.out.println("Electric Engine start");
    }
    @Override
    public void acc(){
        System.out.println("Electric Engine acc");
    }
    @Override
    public void stop(){
        System.out.println("Electric Engine stop");
    }
}
