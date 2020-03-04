package day24;
import java.util.Arrays ;
public class Array_Task {
    public static void main(String[] args) {

        //create a double array of 3 items, put 3 values
        //get a string representation out of this array and save it as pricesString
        //print each and every character in this String in this format
        //character at index1 is: your character here
        //character at index2 is : your character here till last index

        double[] prices = {5, 8, 3};
        System.out.println(Arrays.toString(prices));
        //this method gives you String representation of array object
        //in this format [firstItem, secondItem......lastItem]
        //i can save it to String variable
        String allPrices = Arrays.toString(prices);
        System.out.println(allPrices.charAt(1));
        System.out.println(allPrices.charAt(2));
        //we are looping over a String not an array so we keep looping until last character finishes
        // to make it obvious that [ ]  and, are part of the String we got from the method
        for (int x = 0; x < allPrices.length(); x++) {
            System.out.println("character at index " + x + " is "+ allPrices.charAt(x));

        }
    }
}
