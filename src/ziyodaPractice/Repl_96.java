package ziyodaPractice;

import java.util.Scanner;

public class Repl_96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for (int i = 1; i <count ; i++) {

            System.out.print(word+separator);
        }
        System.out.print(word);

        /*for(int x=1; x<=count; x++){
            if(x<count-1){
                System.out.print(word+separator);

            }else if(count==1){
                System.out.println(word);
            }
        }*/

    }
}
