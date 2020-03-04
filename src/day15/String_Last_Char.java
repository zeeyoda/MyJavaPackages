package day15;

public class String_Last_Char {
    public static void main(String[] args) {
        String name = "Sabira";
        int characterCount= name.length() ;
        int lastCharIndex = characterCount -1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("LAST CHAR IS " + lastChar);
        System.out.println("Last char in one shot " + name.charAt( name.length()-1));
    }
}
