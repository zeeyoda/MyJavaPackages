package ziyodaPractice;

import java.util.Scanner;

public class Replt_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        if(word.equals(countOfDogs) && word.equals(countOfCats)){
            System.out.println("True");
        }else if(word.equals(countOfCats) || word.equals(countOfCats)) {
            System.out.println("False");
        }else if( word.equals(countOfCats) | word.equals(countOfDogs)) {
            System.out.println("False");
        }

    }
}


