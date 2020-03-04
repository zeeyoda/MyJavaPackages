package day16;
import java.util.Scanner;

public class String_Reverse_Order_Assign {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word1 = "";
        String word2 = "Yes";
        String word3 = "";
        word3 = ""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        String word4 = "No";
        System.out.println("What would you like to drink? ");
        word1 = scan.next();
        System.out.println("Would you like to know how to spell it in reverse order? ");
        word2 = scan.next();
        if(word2.equals("Yes")) {
            System.out.println(word3);
        }else if(word4.equals("No")){
            System.out.println("As you wish");
        }

        //System.out.println();
        //word2 = ""+ word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        //word2 = word2 + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        //word2 += word1.charAt(3) +"+ word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        //System.out.println("word2 " + word2);

        //String msg = "Hello ";
        //msg = msg + "World";
        //msg += "World";
        //System.out.println(word2);




    }
}
