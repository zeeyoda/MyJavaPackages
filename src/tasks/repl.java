package tasks;

import java.util.Arrays;

public class repl {
    public static void main(String[] args) {
        String greeting = "Hello";
        String[] gtreetingSplit = greeting.split("",3);
        System.out.println(Arrays.toString(gtreetingSplit));

        String name = "Gorilla";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));

        }
            System.out.println();
            System.out.print(name.charAt(name.length()-1));
        }

    }

