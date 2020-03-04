package muhtar_Day37;

public class CarObjects {
    public static void main(String[] args) {

        Car_Muhtar car1 = new Car_Muhtar();
        car1.brand = "Toyota";
        car1.model = "XLE";
        car1.year = 2020;
        car1.color = "Black";
        car1.mileage = 5000.00;
        car1.price = 37500.50;
        System.out.println(car1.year);
        car1.drive();
        car1.start();
        car1.getInfo();

        Car_Muhtar car2 = new Car_Muhtar();

        car2.brand = "Nissan";
        car2.model = "Pathfinder";
        car2.year = 2018;
        car2.color = "White";
        car2.mileage = 25000;
        car2.price = car2.mileage;
        car2.drive();
        car2.start();
        car2.getInfo();

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);

        Car_Muhtar car3 = new Car_Muhtar();
        car3.getInfo();
        car3.brand = "Lexus";
        car3.model = "RX350";
        car3.year = 2020;
        car3.mileage = 25000;
        car3.color = "Purple";
        car3.price = 40000;
        car3.drive();
        car3.start();
        car3.getInfo();


    }
}
