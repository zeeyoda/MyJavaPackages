package day16;

public class Get_Second_Word {
    public static void main(String[] args) {
       //                  01234567890
        String sentence = "I love Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
        System.out.println(sentence.substring(1+1, 6));
        secondWord = sentence.substring(firstSpaceIndex+1 , lastSpaceIndex);
        System.out.println("secondWord = " +secondWord);

        // first word is from 1st character till first space ""
        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);
        String lastWord = sentence.substring(lastSpaceIndex +1);
        System.out.println("lastWord = " + lastWord);

    }
}
