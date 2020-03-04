package ziyodaPractice.Repl210;

public class Utils {

        public static String reverseLetters(String word){
            //TODO

            return word;
        }

}
class Main{
    public static void main(String[] args) {

        String result = Utils.reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false
    }
}
