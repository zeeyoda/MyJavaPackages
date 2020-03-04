package day20;

public class Practice_Reverse_Name {
    public static void main(String[] args) {
        //String name with value-->
        //reverse this name and store reversed value into
        //another String variable reversedName

        String name = " Abduvohid";
        String reversedName = "";
        for( int x = 8; x>= 0; x--){
            System.out.print(x + "index: ");
            char currentChar = name.charAt(x);
            System.out.println( currentChar);
            reversedName = reversedName + currentChar;

        }
        System.out.println("reversedName = " + reversedName);
        System.out.println("------------------------------------------------");

        String ona = "Ziyoda Abdushaidova";
        String reversedOna = "";
        int lastCharIndex = ona.length()-1;
        for( int m = lastCharIndex; m>=0; m--){
            System.out.print(m + " index: ");
            char presentChar = ona.charAt(m);
            System.out.println(presentChar);
            reversedOna = reversedOna + presentChar;
        }
        System.out.println("reversedOna = " + reversedOna);
        System.out.println("");


    }
}
