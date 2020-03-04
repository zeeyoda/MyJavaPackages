package ziyodaPractice;

import java.util.Scanner;

public class Repl_137 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[]sentenceSplit = sentence.split(" ");

        for (int i = sentenceSplit.length-1; i >=0; i--) {
            System.out.print(sentenceSplit[i]);

            System.out.println();


        }

    }
}
