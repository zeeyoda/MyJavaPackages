package day07;

import java.util.Scanner;

public class MyContactInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstLast, lastName, city, state, country;
        int age;
        firstLast = scan.next();
        lastName = scan.next();
        city = scan.next();
        state = scan.next();
        country = scan.next();
        age = scan.nextInt();

        System.out.println("My name is "+ firstLast+ ".\n"+"My last name is: "+lastName+ ".\n"+"I live in "+city+" "+state+" "+country+".\n"+"My age is "+ age+".");



    }

}
