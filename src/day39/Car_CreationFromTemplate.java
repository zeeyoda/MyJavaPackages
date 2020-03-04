package day39;

public class Car_CreationFromTemplate {
    public static void main(String[] args) {

        //create car object using Class
        // or
        //Get an instance of Car class

        Car_Template car = new Car_Template();

        car.make = "Toyota";
        car.year = 2012;
        car.model = "Sienna";
        car.color = "Silver";
        car.goForward();

        car.year = 2020;

        System.out.println("car make = " + car.make);
        System.out.println("car year = " + car.year);
        System.out.println("car model = " + car.model);
        System.out.println("car color = " + car.color);

        Car_Template car2 = new Car_Template();
        car2.make = "Nissan";
        car2.year = 2018;
        car2.model = "Pathfinder";
        car2.color = "White";
        car2.goForward();

        System.out.println("car2 make = " + car2.make);
        System.out.println("car2 year = " + car2.year);
        System.out.println("car2 model = " + car2.model);
        System.out.println("car2 color = " + car2.color);
        car2.color=car.color;

        System.out.println("car2 color has changed to car 1 color "+car2.color);




    }
}
