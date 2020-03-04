package day36;

import java.util.ArrayList;

public class Ziyoda_Practice_1 {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<>();

        myInt.add(56);
        myInt.add(25);
        myInt.add(47);
        myInt.add(65);
        myInt.add(8);

        System.out.println(myInt.get(3));
        System.out.println("=========================================");
        for (int i = 0; i < myInt.size(); i++) {
            System.out.println("This is what I have at every index = "+myInt.get(i));

        }
        myInt.add(2,36);
        System.out.println("Practice with for each loop after inserting 36 at index 2");
        for (Integer each: myInt) {
            System.out.println("This is how we look at every element using for each loop "+each);

        }

        int sum = 0;
        for (int x = 0; x < myInt.size() ; x++) {
            sum = sum + myInt.get(x);

        }
        System.out.println("This is the sum of my arraylist = "+sum);

        int max = myInt.get(0);
        for (Integer eachVal: myInt) {
            if(eachVal > max){
                max=eachVal;
            }
        }
        System.out.println("This is the max value = " +max);

        int min = myInt.get(0);
        for (Integer eachEl: myInt) {
            if(eachEl<min){
                min=eachEl;
            }
        }
        System.out.println("This is the minimun value = "+min);

        System.out.println("Set method replaces the value at a given index");

        myInt.set(3, 4);
        for (int k = 0; k < myInt.size(); k++) {

            System.out.print( myInt.get(k)+ ", ");
        }
    }
}
