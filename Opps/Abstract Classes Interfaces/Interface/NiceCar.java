public class NiceCar {
    private Engine engine;
    private Media plaMedia = new CDmedia();

    public NiceCar() {
        this.engine = new PowerEngine();
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void UpgardeEngine() {
        this.engine = new ElectricEngine();
    }

    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }

    public void startmusic() {
        plaMedia.start();
    }
    public void stopmusic() {
        plaMedia.stop();
    }
}
