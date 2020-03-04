package day60.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneTwo {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("The Start");
            readMyFile();

        Thread.sleep(3000);
        System.out.println("The end ");

    }
//FileNotFoundException extends to IOException
    public static void readMyFile() {
        System.out.println("Reading the file in my computer");
        try {
          //  throw new FileNotFoundException("Kaboom! File is not here.");
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/heroes.txt"));
            System.out.println(allLines);
        } catch (IOException e) {
            System.out.println("Caught in readMyFile and handled.");
        }
    }
    //Files is a class coming from import java.nio.file package
    // it has lots of file related utility.
    //readAllLines static method is easiest way to read a text file (including csv file)
    //it accepts a file path as argument and return all lines in a List of String
    //readAllLines method declares (document) to throw IOException
    //IOException is checked exception -->> must be handled or declared

    //quick side bar : FileNotFoundException is sub class of IOException
}
