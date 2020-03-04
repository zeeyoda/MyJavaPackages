package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Gulnar, Dilnar,Ilnur,Subi, Ziyoda, Lala";
        //we remove the space first
        students = students.replace(" ", "");
        //we split by comma
        String[] studentsArray = students.split(",");

        System.out.println(Arrays.toString(studentsArray));
        System.out.println("length of studentsArray " + studentsArray);


        for (int x = 0; x < studentsArray.length; x++) {
            String name = studentsArray[x];
            System.out.println("Spelling = " + name);

            //System.out.println("\n");
            //String name1 = studentsArray[1]; //Gulnar// G-u-l-n-a-r-
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-");
            }
            System.out.println();
        }
    }
    }

