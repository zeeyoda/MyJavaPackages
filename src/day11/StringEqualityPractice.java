package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        //checking for String equality should always be done
        //using equals. method of String
        //It will look like String.equals(anotherString) -->> true or false

        //just comparing 2 String literal directly using equals method
        System.out.println("Java".equals("java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");
        System.out.println( "Is myStr same as yourStr");
        System.out.println( myStr.equals(yourStr));
    }
}
