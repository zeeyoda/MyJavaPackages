package  day24;

import java.util.Arrays;

public class Ziyoda_Arrays_toString {
    public static void main(String[] args) {
        //arrays class from from java.util package
        //it has many prebuilt methods to work with array object

        String[] names = {"Ziyoda", "Saida","Sabira","Adil","Azat","Ablatt"};
        System.out.println(Arrays.toString(names));

        String namesSavedAsString = Arrays.toString(names);

        System.out.println(namesSavedAsString);
        //getting the first character of name namesSavedAsString variable
        System.out.println(namesSavedAsString.charAt(0));//[ is the first index of String representation of an array

        int[] numbers = {4, 5, 8, 98, 12, 65};
        System.out.println(Arrays.toString(numbers));

        double[] items = {4, 8, 9};
        System.out.println(Arrays.toString(items));
        String itemsString = Arrays.toString(items);
        System.out.println(itemsString.substring(0, itemsString.length()));

        //another method to solve this task
        for(int x=0; x<itemsString.length(); x++ ){
            System.out.print(itemsString.charAt(x)+"");
        }




    }
}
