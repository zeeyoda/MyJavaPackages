package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount  ) ;

        short sheepCount = 300;
        System.out.println(" The sheep count is " +  sheepCount) ;

        int catCount =  20 ;

        System.out.println(" The cat count is " + catCount) ;

        long mileToMoon = 4590000l;
        System.out.println(" Mile to moon is " + mileToMoon) ;
        long mileToSun = 100000000L;
        System.out.println(" Mile to sun is " + mileToSun) ;

        //---------------floating point----------------
        // you must add f at the end of number to indicate this is float data type
        // uppercase, lowercase doesn't matter, but it is mandatory

        float priceOfBanana = 1.99f ;
        System.out.println(" The price of banana is " + priceOfBanana);
        float priceOfPotato = 1.49f ;
        System.out.println("The price of potato is " + priceOfPotato);

        //----------------- larger floating point numbers -----------------

        double priceOfIpad1 =  355.99d;
        System.out.println("The price of ipad is " + priceOfIpad1);
        double priceOfIpadPro = 1024.99D;
        System.out.println("The price of IpadPro is " + priceOfIpadPro);
        // compiler automatically assumes it is a double, so it is not required to have d
        // However for good programming habit, always add them.
        double priceOfMac = 2299.99 ;
        System.out.println("The price of mac is " + priceOfMac);

        // if you have a whole number by itself, compiler automatically assumes it is an int
        // if you have a fractional number by itself, compiler automatically assumes it is a double

    }
}
