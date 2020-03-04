package muhtar53;

import java.util.function.DoubleToIntFunction;

public class DearlerShip {
    public static void main(String[] args) {

        Tesla_Model3 tesla = new Tesla_Model3();
        tesla.start();
        tesla.charge();
        tesla.selfDrive();
        System.out.println("--------------------------------------------");

        Jeep_Wrangler jeep = new Jeep_Wrangler();
        jeep.pumpGas();
        jeep.start();
        System.out.println("----------------------------------------------");

        Toyota toyota = new Toyota();
        toyota.charge();
        toyota.pumpGas();
        toyota.selfDrive();
        toyota.start();
    }
}
