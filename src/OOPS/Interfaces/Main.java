package OOPS.Interfaces;

public class Main {
    //interfaces is to obtain the multiple inheritance
    //interfaces by default contains abstract functions and the variables are static and final by default
    //don't use interfaces normally in performance critical code
    //static inherit methods should always have a body
    public static void main(String[] args) {
//        Car mycar=new Car();
//        mycar.accelarate();
        NiceCar car=new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
