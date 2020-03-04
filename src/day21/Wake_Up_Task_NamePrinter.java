package day21;

public class Wake_Up_Task_NamePrinter {
    public static void main(String[] args) {
        String myName = "My name is Ziyoda";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);
        for (int x = 0; x <= lastCharIndex; x++) {


            // System.out.print(myName.charAt(x)+ "->");
            System.out.print(myName.substring(x, x + 1) + "->");
            System.out.print("") ;
        }
        //for (int i = 0; i < charCount-2; i++) {
        for (int i = 0; i <= lastCharIndex; i++) {

            String twoChar = myName.substring(i, i + 2);
            System.out.println(twoChar + "->");
            System.out.println();

            for (int k = 0; k <= lastCharIndex; k++) {

                String threeChar = myName.substring(k, k + 3);
                System.out.print(threeChar + "->");
            }
        }

    }
}


