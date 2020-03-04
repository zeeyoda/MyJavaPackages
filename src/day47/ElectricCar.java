package day47;

public class ElectricCar extends Car{

    int batteryLvl;

    @Override
    public void start() {
        System.out.println("This is how electric car start");
    }
//    public static void main(String[] args){
//
//       // Car c1 = new Car();
//        ElectricCar e1 = new ElectricCar();
//        e1.start();
//
//    }
    @Override
    public void goForward(){
        System.out.println("Go forward");

    }

    @Override
    public void turn(String str) {
        System.out.println("Turn to "+str);

    }

    @Override
    public void goBackward() {
        System.out.println("Go backwards");

    }
}
