package OOPS.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power engine start");
    }

    @Override
    public void stop() {
        System.out.println("power engine stop");
    }

    @Override
    public void accelarate() {
        System.out.println("power engine accelerate");
    }
}
