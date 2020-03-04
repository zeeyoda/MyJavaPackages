package ziyodaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_135 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] splitSentence = sentence.split(" ");
        for (int i = 0; i <splitSentence.length ; i++) {
            System.out.println(splitSentence[i]);


        }
    }
}
