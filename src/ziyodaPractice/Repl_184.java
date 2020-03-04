package ziyodaPractice;

public class Repl_184 {
    public static void main(String[] args) {

        /**
         * at3 gets two strings and returns a string.
         * the first string is the one that will be manipulated. at the 3rd char position of target you will insert
         * the word argument.
         * example use:
         * at3("longword","foo")
         * will return: "lonfoogword"
         * at3("blabla","a")
         * will return: "blaabla"
         */
        String text = "longwood";
        int length1 = text.length();
        String word = "foo";


        String at3 = text.substring(0, 3)+word+text.substring(3, length1);
        System.out.println(at3);
    }
}
