package day19;

public class Finding_NumberOfLettersInAWord {
    public static void main(String[] args) {
        String name = "Bahliddin Ahmad";
        int countOfA = 0;
        System.out.println( name.charAt(0)=='a');
        for( int index = 0; index<name.length(); index++){
            System.out.println(name.charAt(index));
            if(name.charAt(index) == 'a'){
                System.out.println("Bingo, found it");
                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);
    }
}
