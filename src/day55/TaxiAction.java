package day55;

public class TaxiAction {

    //Taxi Engine -- Driver -- Passenger
    //Taxi has a Driver -- Driver object has 2 attributes (name, driverID)
    //
    public static void main(String[] args) {

        Engine en = new Engine("v6", 400);

        Driver d = new Driver("Pedro", 12345);

        Taxi t1 =  new Taxi(101, en, d);

       System.out.println("t1 = "+t1);

        Taxi t2 = new Taxi(102, new Engine("v6", 400), new Driver("Pedro", 12345) );
        System.out.println("t2 = " + t2);

        //print out driver name and car horse power
        //driver <name> is driving the taxi with horsepower <> on the highway

        System.out.println(t2.dr.name);

        //how do I store t2 plate number in variable int x

        int x = t2.plateNumber;

        //how do I store the t2 Driver field in a variable y;

        Driver y = t2.dr;

        //how do I store the t2 Engine field in a variable z;
        Engine z = t2.eng;

        //how do i get name of the driver using t2
        System.out.println("Driver name "+y.name);
        System.out.println("Driver name "+t2.dr.name);

        //how to I get the horse power of the car from Engine using t2
        System.out.println(t2.eng.horsePower);

        //how do I get the first character of the driver's name
        System.out.println(t2.dr.name.charAt(0));
    }
}
