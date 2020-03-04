package OfficeHour;

import java.util.Enumeration;

public class Practice_12_12_1 {
    public static void main(String[] args) {
        //1.Write a program that is going to print out unique values from an int Array
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};

        int count = 0;

        for (int j = 0; j < numbers.length; j++) {


            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == numbers[j]) {
                System.out.println(1);
            }
        }
        //WRITE A PROGRAM THAT CAN PRINT OUT THE UNIQUE VALUES FROM STRING ARRAY
        String[] array = {"A", "A", "B", "C", "C"};
        for (int j = 0; j < array.length; j++) {
            int count2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(array[j])) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(array[j]);
            }
        }
        //Write a program that can find the second ax number from an int array. Do Not use sort method

        int[] grades = {1,2,3,4,5,6,7,8};
        int max = grades[0];
        for(int eachGrade: grades) {
            if (grades[1] > max) {
                max = grades[1];
            }
        }
        System.out.println(max);

        int secondMax = grades[0];
        for(int eachGrade : grades){
            if(eachGrade == max){
                continue;
            }
            if(eachGrade>secondMax){
                secondMax=eachGrade;
            }
        }
        System.out.println("Second max number:" + secondMax);

        //Swap two variable values without using a temporary variable
        int a = 10, b=20;
        //expected result: a=20, b=10;
        int c = a; //c=10;
        a=b;// a=20
        b=c; // b=c
        a=a+b;//a=30
        b=a-b; //b=30-20=10
        a=a-b;//a=30-10=20
        System.out.println(a+" "+b);
    }
}
