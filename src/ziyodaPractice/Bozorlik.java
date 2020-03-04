package ziyodaPractice;

import java.util.Scanner;

public class Bozorlik {

    public static void main(String[] args) {
        String item1;
        String item2;
        String item3;
        String report;
        double price1;
        double price2;
        double price3;
        double totalPrice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();
        totalPrice = price1 + price2 + price3;

        report = "Item1: " + item1 + " Price:" + price1 + ", "
                + "Item2: " + item2 + " Price:" +price2+", "+
                "Item3: "+item3+" Price: "+price3;
        System.out.println("\"" + report + "\" " + "\n\"Total price is: "+totalPrice+"\"");


    }
}
