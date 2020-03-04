package ziyodaPractice;

public class Repl_182 {
    public static void main(String[] args) {

        System.out.println(clean("foo bar", "foo"));

    }
    public static String clean (String text ,String badWord){

       String noDup = text.replace(badWord, "");
        return noDup;
    }
}
