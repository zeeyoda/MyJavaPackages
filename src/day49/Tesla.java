package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {
    int horsePower;
    String model;

    public Tesla(int yr, int hp, String md){
        super(yr);
        horsePower = hp;
        model = md;

    }
    @Override
    public void selfDrive(){
        System.out.println("This car can drive by itself");

    }
    @Override
    public void start(){
        System.out.println("Starting this car is so convenient");

    }
    @Override
    public void charge(){
        System.out.println("Charge the car.");

    }

   public String toString(){
        return "Year is "+year+" horse power is "+horsePower+" model is "+model;
   }

    public static void main(String[] args) {
        Tesla t1 = new Tesla(2016, 120,"Best");
        t1.selfDrive();
        t1.start();
        t1.goForward();
        t1.charge();
        System.out.println(t1.toString());
    }
}
