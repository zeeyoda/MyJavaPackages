package ziyodaPractice;

import java.util.Scanner;

public class ContactInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, fullName, email, street, state, city,
                address, contacts;
        int age;
        int zipCode;
        System.out.println("\"Enter your first name\"");
        firstName = scan.nextLine();
        System.out.println("\"Enter your last name \"");
        lastName = scan.nextLine();
        System.out.print("Your last name is ");

        System.out.println("\"Enter your email\"");
        email = (firstName+""+lastName+"@gmail.com");
        System.out.println("\"Enter your street\"");
        street = scan.nextLine();
        System.out.println("\"Enter your city\"");
        city = scan.nextLine();
        System.out.println("\"Enter your state\"");
        state = scan.nextLine();
        System.out.println("\"Enter your zipCode\"");
        zipCode = scan.nextInt();



    }
}

