package day47;

public class Garage {

    public static void main(String[] args) {
        //Abstract class cannot be instantiated
        //it means we cannot create object from it
        //Car c1 = new Car();

        ElectricCar c1 = new ElectricCar();
        c1.start();
        c1.goForward();
        c1.goBackward();
        c1.turn("Right");

        GasCar gc1 = new GasCar();
        gc1.start();
        gc1.goBackward();
        gc1.turn("Left");
        gc1.goForward();
    }
}
