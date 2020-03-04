package muhtar_Day37;

public class Car_Muhtar {
    String model;
    int year ;
    String brand;
    String color;
    double price;
    double mileage;
    int vin;

    public void drive(){
        System.out.println(brand+" is being driven");
    }
    public void start(){
        System.out.println(brand+" has started");
    }
    public void getInfo(){
        System.out.println(year+ " "+brand+" "+model+", Color: "+color+", Price: "+price);

    }

}

