package day20;

public class Interview_Reverse_String {
    public static void main(String[] args) {
        //reverse this name and store reversed value into
        //another String variable reversedName
        //             01234567
        String name = "Ziyoda Abdushaidova";
        String reversedName = "";
        int lastCharIndex = name.length()-1;
        for( int x = lastCharIndex ; x>=0; x--){
            System.out.print(x  + " index: ");
            char currentChar = name.charAt(x);
            System.out.println(name.charAt(x));
            reversedName = reversedName + currentChar ;
        }
        System.out.println("reversedName "+ reversedName);
    }
}
