package ziyodaPractice;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );
        String a = s.nextLine();
        if(a.equals("a")){
            System.out.println(a + " is wrong");
        }else if (a.equals("b")){
            System.out.println(a + " is correct");
        }else if (a.equals("c")){
            System.out.println(a + " is wrong");
        }else{
            System.out.println(a + " in not a valid answer");
        }
    }

        }


