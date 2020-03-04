package day35;

public class CharacterPractice {
    public static void main(String[] args) {
        System.out.println("Is DIGIT Method Practice");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        //get the number from this string and store it into Integer Variable
        String numsInStr = "";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))) {
                System.out.println("str.charAt(" + i + ") =" + str.charAt(i));
                numsInStr+=str.charAt(i);
            }
        }
        System.out.println("numsInStr = "+numsInStr);
        // The requirement says get the result as Integer object
        Integer num = Integer.valueOf(numsInStr);
        System.out.println("num = "+num);



        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))) {
                System.out.println("str.charAt(" + i + ") =" + str.charAt(i));
                numsInStr += str.charAt(i);
            }
            }
    }
}
