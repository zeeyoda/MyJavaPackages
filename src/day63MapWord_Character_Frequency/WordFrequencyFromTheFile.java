package day63MapWord_Character_Frequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class WordFrequencyFromTheFile {
    public static void main(String[] args) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\ziyod\\IdeaProjects\\Project-1\\src\\day63MapWord_Character_Frequency\\ZiyodaFile"));
            System.out.println("allLines = " + allLines);

            String allLinesAsString = allLines.toString();
            Map<String, Integer> map = WordFrequencyMethod.getFrequencyMap(allLinesAsString);
            System.out.println("map = " + map);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
