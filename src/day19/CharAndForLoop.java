package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        char myChar = 'A';
        System.out.println(myChar);
        //'A' + 1 -->> 65+1 =66-->>66-->>'B' (myChar data type is char)
        System.out.println(++myChar);
        //'B' + 1 -->> 66+1 =67-->>67-->>'C' (myChar data type is char)
        System.out.println(++myChar);
        //'C' + 1 -->> 67+1 =68-->>68-->>'D' (myChar data type is char)
        System.out.println(++myChar);
        //'D' + 1 -->> 68+1 =69-->>69-->>'E' (myChar data type is char)
        System.out.println(++myChar);
        //'E' + 1 -->> 69+1 =70-->>70-->>'F' (myChar data type is char)

        System.out.println('A' > 'B');//65>66
        System.out.println('Z' > 'B');// 65>66

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");

        }
        System.out.println();

        for (char kChar = 'Z'; kChar >= 'A'; kChar--) {
            System.out.print(kChar + " ");

        }
        String line = "";
        for( char kChar = 'A'; kChar<='Z'; kChar++){
            line += kChar;
            System.out.println(line);
        }
        //Homework
        //create an interactive program to ask the user starting character and ending character
        //then print everything in between
        //it could be starting character is after ending character
        //for example user can enter Z A or A K
        //can we ask user character? No
        //ask user for String and pick first character by charAt(0)
    }
}
