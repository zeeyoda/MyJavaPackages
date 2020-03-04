package day21;

public class Ziyoda_Practice_Loop_Print_2Character {
    public static void main(String[] args) {

        String name = "Gipopotamus";
        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lastIndex = charCount-1;
        System.out.println("lastIndex = " + lastIndex);

        for (int x = 0; x <=name.length()-2 ; x++) {
        String charCount1 = name.substring(x, x+2);
            System.out.print(charCount1);
            System.out.print(" ");
        }
        for (int k = 0; k <=name.length()-3; k++) {

        }
    }
}
