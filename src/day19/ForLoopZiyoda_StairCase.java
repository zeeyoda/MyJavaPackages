package day19;

public class ForLoopZiyoda_StairCase {
    public static void main(String[] args) {
        String stairCaseZiyoda = "";
        for(int x=1; x<=5; x++){
            stairCaseZiyoda += "Ziyoda";
            System.out.println(x + " " +stairCaseZiyoda);
        }
        String line = "";
        for( char iChar = 'A'; iChar<='Z'; iChar++){
            line += iChar;
            System.out.println(line);
        }
    }
}
