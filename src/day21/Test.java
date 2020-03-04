package day21;

public class Test {

    public static void main(String[] args) {
        String myName = "My name is Ziyoda";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);
        for (int x = 0; x <= lastCharIndex; x++) {
            System.out.print(myName.substring(x, x + 1) + "->");

        }System.out.println("");

        for (int x = 0; x <= lastCharIndex; x++) {
            System.out.print(myName.substring(x, x+2)+"*");

        }
    }
}
