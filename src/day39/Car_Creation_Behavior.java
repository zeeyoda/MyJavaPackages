package day39;

public class Car_Creation_Behavior {
    public static void main(String[] args) {
        Car_Template car = new Car_Template();

        car.make = "Toyota";
        car.year = 2012;
        car.model = "Sienna";
        car.color = "Silver";
        car.goForward();
        car.getAge();
        car.changeColorTo("Blue");
        System.out.println(car.color);
        System.out.println("============================================");

        Car_Template car2 = new Car_Template();
        car2.make = "Nissan";
        car2.year = 2018;
        car2.model = "Pathfinder";
        car2.color = "White";
        car2.goForward();
        car2.getAge();
        System.out.println("END");



    }
}
