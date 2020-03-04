package day27;

import java.util.Arrays;

public class Ziyoda_Practice_2DArrayString {
    public static void main(String[] args) {


        String[][] names ={{"Mookie", "Junior"},{"Murphy", "Libby"}};
        //print Murphy
        System.out.println(names[1][0]);
        //change Murphy to Barbos
        names[1][0]="Barbos";
        System.out.println(names[1][0]);
        System.out.println(Arrays.toString(names[1]));
        //print the entire array
        System.out.println(Arrays.deepToString(names));
    }
}
