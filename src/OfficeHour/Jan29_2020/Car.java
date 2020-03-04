package OfficeHour.Jan29_2020;

public abstract class Car {

    public abstract void start();

}
class Toyota extends Car{

    @Override
    public void start(){
        System.out.println("Push the button");
        System.out.println("Start Engine");

    }
}
class Jeep extends Car{

@Override
    public void start(){
        System.out.println("Call Mechanic");
        System.out.println("Oil Change");
        System.out.println("Start the engine");

    }
}
abstract class ElectricCars extends Car{

    public abstract void hasBattery();
    //there are 2 abstract methods: start(),  hasBattery();
}
class Tesla extends ElectricCars{
    @Override
    public void start(){
        System.out.println("Say start.");
        System.out.println("Start engine");

    }
    public  void hasBattery(){
        System.out.println("Tesla has battery");

    }
}
class Test{
    public static void main(String[] args) {
        Jeep j = new Jeep();
        j.start();

        System.out.println("==========================================");


        Tesla tesla = new Tesla();
        tesla.start();
        tesla.hasBattery();
    }
}
