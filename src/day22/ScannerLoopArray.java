package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int x = 0; x < numbers.length; x++) {
            System.out.println("Enter your number "+ (x+1)); // x+1 so that it is more understandable to the user
            numbers[x] = scan.nextInt();
            System.out.println(numbers[x]);

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");


        }
    }
}
