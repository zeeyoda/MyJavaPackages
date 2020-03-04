package day49;

public abstract class Vehicle {

    int year;

    public Vehicle(int yr){
    year = yr;
    }

    public abstract void start();

    public void goForward(){
        System.out.println("Car is going forward");
    }


}
