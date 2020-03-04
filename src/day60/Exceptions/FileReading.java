package day60.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {
        //reading a file is one line of code as below
        //it returns list of String as each line as element
    try {
        List<String> allLines = Files.readAllLines(Paths.get("src\\day60\\Exceptions_Collections\\note.txt"));
        System.out.println("allLines" + allLines);
        for (String each : allLines) {
            System.out.println(each);

        }
    }catch (Exception e){
        System.out.println("Boom!");
        System.out.println(e.getMessage());
    }
    }

}
