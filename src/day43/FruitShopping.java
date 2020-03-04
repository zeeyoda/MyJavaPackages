package day43;

import java.util.Arrays;
import java.util.List;

public class FruitShopping {
    public static void main(String[] args) {

        Fruit f1 = new Fruit();
        f1.setName("Apple");
        f1.setColor("Red");
        f1.setPrice(5.25);
        System.out.println(f1);
        Fruit f2 = new Fruit("Pear", "yellow", 2.25);
        Fruit f3 = new Fruit("Orange","orange", 5.10);
        Fruit f4 = new Fruit("Banana", "green", 1.69);
        Fruit f5 = new Fruit("Grape", "green", 8.99);
        List<Fruit> fruits = Arrays.asList(f1, f2, f3, f4, f5);
        System.out.println(fruits);

        Fruit f6 = null;
        System.out.println(f6);



    }
}
