package ziyodaPractice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        age = scan.nextInt();
        if(age<2){
            System.out.println("ineligible");}

        if(age==2){
            System.out.println("toddler");}

        if(age>=3 && age<=5){
            System.out.println("early childhood");}

        if(age>=6 && age<=7){
            System.out.println("young reader");}

        if (age>=8 && age<=10){
            System.out.println("elementary");}

        if (age>=11 && age<=12 ){
            System.out.println("middle");}

        if (age==13){
            System.out.println("impossible");}

        if (age>=14 && age <=16){
            System.out.println("high school");}

        if (age>=17 && age<=18){
            System.out.println("scholar");}

        if (age>18){
            System.out.println("ineligible");}
    }
}
