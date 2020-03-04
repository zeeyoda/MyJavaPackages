package muhtar53;

public class Toyota implements Cars, ElectricVehicles, GasVehicles {

    @Override
    public void start() {
        System.out.println("I am starting my old Toyota");

    }
    @Override
    public void pumpGas(){
        System.out.println("I will have to pump gas into my Toyota.");

    }

    @Override
    public void charge() {
        System.out.println("My Toyota is not the Hybrid kind, but I can still charge it.");

    }
    @Override
    public void selfDrive(){
        System.out.println("Even though not hybrid, this Toyota still has a self drive mode.");

    }
}
