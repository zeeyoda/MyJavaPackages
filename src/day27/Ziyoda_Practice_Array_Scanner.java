package day27;

import java.util.Arrays;
import java.util.Scanner;

public class Ziyoda_Practice_Array_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------------------------------------");
        //write a program that assigns the value to each index 0 to 5

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an int number: ");
            //int input = scan.nextInt();
            //numbers[i] = input;
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
