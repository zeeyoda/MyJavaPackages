package muhtar53;

public class Tesla_Model3 implements Cars, ElectricVehicles {

    @Override
    public void start() {
        System.out.println("Voice constrol \"Tesla Start\" ");

    }
    @Override
    public void charge(){
        System.out.println("Tesla is charging");

    }
    @Override
    public void selfDrive(){
        System.out.println("Tesla is a self drive car.");

    }
}
