package OfficeHour;

public class Practice_12_23 {
    public static void main(String[] args) {
        String word = "computer";
        reverseString(reverseString(word));
        //System.out.println(reverseString("word"));
       // String result = reverseString(word);
       // System.out.println(result);

    }
    public static String  reverseString(String str){
        String reversedString = "";
        for (int i =str.length()-1; i <=0; i--) {
            reversedString=reversedString+str.charAt(i);

        }
        return "";
    }
}
