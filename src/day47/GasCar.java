package day47;

public class GasCar extends Car {
    int gasLvl;

    @Override
    public void start() {
        System.out.println("GasCar has started at level "+gasLvl);

    }

    @Override
    public void goForward() {
        System.out.println("GasCar is going forward");

    }
    @Override
    public void turn(String str) {
        System.out.println("GasCar has turned "+str);

    }

    @Override
    public void goBackward() {
        System.out.println("GasCar is going backwards");

    }
}
