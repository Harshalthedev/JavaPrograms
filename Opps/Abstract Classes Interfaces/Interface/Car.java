public class Car implements Engine, Brake, Media {
    @Override
    public void brake() {
        System.out.println("i can brake");
    }
    @Override
    public void start() {
        System.out.println("i start engine like a normal car");
    }
    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car");
    }
    @Override
    public void acc() {
        System.out.println("i can accelerate like a normal");
    }
}
