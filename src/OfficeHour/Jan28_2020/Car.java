package OfficeHour.Jan28_2020;

import java.util.Arrays;
import java.util.List;

public class Car {

    String brand;
    //Car has Engine, we are using Engine as instance variable
    //data type
    Engine e;
    //I want a car that has passenger names attached to it
    String[] passengers;
    List<String> names;


    public static void main(String[] args) {

        Car c1 = new Car();
        //There is 2 ways to create String object
        //and we are using new keyword by choice
        c1.brand = new String("Toyota");
        c1.e     = new Engine("V6", 270);
        c1.passengers = new String[]{"Ziyoda", "Mehtap", "Aykokul", "Rauf"};
       // c1.names = new ArrayList<String>(Arrays.asList("Sabira","Saida", "Azat","Adil"));
        c1.names = Arrays.asList("Sabira","Saida", "Azat","Adil");

        System.out.println("c1 = "+c1);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e.toString() +
                ", passengers=" + Arrays.toString(passengers) +
                ", names=" + names+
                '}';
    }
}


