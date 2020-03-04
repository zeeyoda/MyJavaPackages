package muhtar53;

public class Jeep_Wrangler implements Cars, GasVehicles {

    @Override
    public void start() {
        System.out.println("I have just started my Jeep.");

    }
    @Override
    public void pumpGas(){
        System.out.println("I am pumping gas into my Jeep.");

    }
}
