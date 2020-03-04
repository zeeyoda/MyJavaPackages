package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {

    public static void main(String[] args) {
        Apple a1 = new Apple("sweet", "red", "fuji");
        Fruit f1 = new Orange("sour", "orange", 12);
        Fruit f2 = new Apple("crispy", "yellow", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "blood red", 10);

        Fruit[] myFruit = {a1, f1, f2, f3, f4};

        for (Fruit each : myFruit) {
            each.getDigested();

        }
        System.out.println("=================================================");

        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(a1, f1, f2, f3, f4));
        for (Fruit each : fruitList) {

            System.out.println("each.toString() = "+each.toString());
            System.out.println("Class type : "+each.getClass().getSimpleName());

        }



    }
}
