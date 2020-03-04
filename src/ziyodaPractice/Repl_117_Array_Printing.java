package ziyodaPractice;

import java.util.Scanner;

public class Repl_117_Array_Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", " + (arr[i + 1]));
            i++;
        }
    }
}






