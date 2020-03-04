package day22;

import java.util.Spliterator;

public class Homework_1_Multiplication_Table {

    public static void main(String[] args) {

       // for (int row = 0; row <=5 ; row++) {
       // for (int col = 0; col <=5; col++) {
      //      System.out.print(col + " ");
       // }
//        }        System.out.println(" ");
        System.out.println("1x1= " + 1*1);
        System.out.println("1x2= " + 1*2);
        System.out.println("1x3= "+ 1*3);
        System.out.println("Multiplication table of 1");
        for (int base = 0; base <=12 ; base++) {
            System.out.println("1 x " + base + " = " + 1*base);

        }
        System.out.println("Multiplication table of 2");
        for (int base = 0; base <=12 ; base++) {
            System.out.println("2 x " + base + " = " + 2 * base);
        }
        //Plain logic -->> write a code to generate multiplication table of 1 number
        //then repeat it 10 times to generate multiplication table from 1-10

        //this loop is to iterate from 1 to 10 to get multiplication table
        for (int timesTable = 0; timesTable <=10; timesTable++) {
            System.out.println("Multiplication table of " + timesTable);

            //this loop will generate multiplication of one number
            for (int base = 0; base <= 12; base++) {
                System.out.println(timesTable + " x " + base + " = " + timesTable * base);

               // for (int star = 0; star <+n; star++) {

                }
            }
        }


    }

