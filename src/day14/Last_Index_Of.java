package day14;

public class Last_Index_Of {
    public static void main(String[] args) {
        //             012345678901
        String name = "Game of Java";
        //find out the last location the letter a shows up

        System.out.println(" find out the last location letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        System.out.println("find out the last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));

        System.out.println("find out the last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        System.out.println("find out the last location the letter Kawa shows up");
        System.out.println(name.indexOf("Kawa"));

        // if I do not use contains method, what would be my condition to check
        // whether we have Kawa in this string, either using indexOf or lastIndex

        /*if( name.indexOf("Kawa") -1) {
            System.out.println("KAWA FOUND!!!");
        }else{
            System.out.println("No Kawa, No Pumpkin");
        }
*/

    }
}
