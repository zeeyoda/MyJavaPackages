package day15;

import java.util.Scanner;

public class Name_Length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task1 check whether your name length is less than 4
        //if so print short name
        //if  it is within 4-10, print "Medium name"
        //if it is more than 11, print "longer name"
        System.out.println("Enter your name please: ");
        String name = scan.next();
        int lengthOfTheName = name.length();
        System.out.println("Length of the name " + lengthOfTheName);
        if(lengthOfTheName<4) {
            System.out.println("You have a short name");
        }else if(lengthOfTheName>=4 && lengthOfTheName<=11) {
            System.out.println("You have a medium length name");
        }else if(lengthOfTheName<11){
            System.out.println("You have a lengthy name");


        }
        }
    }

