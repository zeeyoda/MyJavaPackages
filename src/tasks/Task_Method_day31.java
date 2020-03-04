package tasks;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Task_Method_day31 {
    public static void main(String[] args) {
      /*  Create below static void methods :
        and call them in main method to test.
        reversePrintMyOwnName
                * create a method that has no parameter
        and print your name in reversed order
                reversePrintAnyName
* create a method that has 1 String parameter called name
        and print that name in reversed order
                printLastCharacterOfName
* create a method that has 1 String parameter called name
        and print last character of that name
                printFullNameInformation
* create a method that has 2 String parameter called firstName,lastName
        and print "Your first name is firstName , Your last Name is lastName
        print " your full name length is lengthOfTheFullName"*/
        reversePrintMyOwnName("Zamira");
        reversePrintAnyName("Adhamjon");
        printLastCharacter("Fotima");
        nameWithDash("Abduvohid");
    }
    public static void reversePrintMyOwnName(String name) {
        //String name = "Ziyoda";
        for (int x = name.length() - 1; x >= 0; x--) {
            System.out.print(name.charAt(x));
        }
        System.out.println();
    }
        public static void reversePrintAnyName(String name){
            //String name = "Gizem";
            for (int x = name.length() - 1; x >= 0; x--) {
                System.out.print(name.charAt(x));
            }
            System.out.println();
        }
        public static void printLastCharacter(String name){
        //String name = "Gorilla";

            System.out.println(name.charAt(name.length()-1));
        }
        public static void nameWithDash(String name){

        for(int x=name.length()-1; x>=0; x++){
            System.out.println(name.charAt(x));
            if(x != name.length()-1){
                System.out.println("-");
                /*if (i != 0) {
                 System.out.print(myName.charAt(i) + "-");
                } else {
                  System.out.print(myName.charAt(i));
                }*/
            }
        }
        }
    }

