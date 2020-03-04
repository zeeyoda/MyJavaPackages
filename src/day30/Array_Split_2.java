package day30;

import java.util.Arrays;

public class Array_Split_2 {
    public static void main(String[] args) {

        String car = "Lexus-IS-F";
        String[] carsSplitted = car.split("-");
        System.out.println("carSplitted = "+ Arrays.toString(carsSplitted));
        System.out.println("car = "+car);

        String model = carsSplitted[1];
        System.out.println("model = "+model);
    }
}
