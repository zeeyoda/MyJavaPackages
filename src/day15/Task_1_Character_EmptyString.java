package day15;

public class Task_1_Character_EmptyString {
    public static void main(String[] args) {

        String book = "Bo";
        int lengthOfTheTitle = book.length();
        if(lengthOfTheTitle>1) {
            System.out.println("" + book.charAt(0) + "" + book.charAt(1));
        }else if(book.isEmpty()) {
            System.out.println("Empty String");
        }else{
            System.out.println("Print first char twice " + book.charAt(0) + "" +book.charAt(0));



        }
    }
}
