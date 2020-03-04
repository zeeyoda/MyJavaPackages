package day36;

public class MethodPracticeString {
    public static void main(String[] args) {
        Boolean result1 = checkIfStringHasNumber("ytz13ck");
        System.out.println("result1 = "+result1);

        System.out.println(checkIfStringHasNumber("a ghk7u"));

        System.out.println(checkIfStringHasNumber("njhg"));

    }

    /**
     * write a static method to accept a String and return Boolean(Yes Uppercase)
     * @param str
     * @return true if the String contains at least one number.
     */
    public static Boolean checkIfStringHasNumber(String str){
        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }

        }
        System.out.println("No Number found!!!");
        return Boolean.valueOf(false);
    }
}
