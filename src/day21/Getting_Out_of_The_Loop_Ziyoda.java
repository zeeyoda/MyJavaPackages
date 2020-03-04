package day21;

public class Getting_Out_of_The_Loop_Ziyoda {
    public static void main(String[] args) {

        String name = "Ziyoda";
        int nameLength = name.length();

        for(int i=0; i<name.length(); i++) {

            char currentChar = name.charAt(i);
            System.out.println(currentChar);

            if (currentChar == 'o') {
                System.out.println("Found it");
                break;
               // String currentChar = name.substring(i, i+1);
               // if(currentChar.equalsIgnoreCase("o")){
                  //  System.out.println("Found it");
                  //  break;
            }
            System.out.println(currentChar);
        }
    }
}
