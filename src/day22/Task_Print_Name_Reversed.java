package day22;

import java.util.Spliterator;

public class Task_Print_Name_Reversed {
    public static void main(String[] args) {
        //store this sentence in a variable mgs
        //loop through each and every letter
        //print every other letter
        //meaning: skip a letter every time you go through the letter
        //I struggle with -->> isrgl ih
        //Use continue for this task
        //when you reach a break the loop
        String msg = "I struggle with Java I like Java I love Java Everything is Awesome";
        int charCount = msg.length();
        for (int x = 0; x <charCount; x++) {
            if(x%2==0) {
                continue;
            }
            System.out.println(x + " : " +msg.substring(x, x+1));
            }
        //task 2
        for (int idx = 0; idx < charCount ; idx++) {
            String currentChar = msg.substring(idx, idx+1);
            if(currentChar.equalsIgnoreCase("a")){
                break;
            }
            System.out.println("currentChar = " + currentChar);
        }
        //task 2 and 2 combined
        for (int i = 0; i < charCount ; i++) {
            //this is the code to skip odd number index letters
            if(i%2==1){
                continue;
            }
            String currentChar = msg.substring(i, i+1);
            if(currentChar.equalsIgnoreCase("J")){
                break;
            }
            System.out.println(i + " index "+" : currentChar = " + currentChar);

        }

            }

        }



