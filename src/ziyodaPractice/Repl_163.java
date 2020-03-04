package ziyodaPractice;

import java.util.Scanner;

public class Repl_163 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System. in);

        String[] arr = {"a","foo","bar","foo","bla"};
        String t = "foo";
            int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(t)){
                count++;
            }
        }

                System.out.println(count);

    }
}
