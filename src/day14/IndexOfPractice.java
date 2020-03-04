package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        // index of  - finds out index of another String inside this String
        //             012345678901
        String name = "Game of Java"; //length is 12, last char index is 11
        // find out the location of Java
        // find out the location of letter 0
        // find out the location of first space

        System.out.println("find out the location of Java");
        System.out.println( name.indexOf("Java"));

        System.out.println("find out the location of o");
        System.out.println( name.indexOf("o"));

        System.out.println("Find out the location of Upper case O");
        System.out.println( name.indexOf("O"));
        // if location is not found we get a negative number

        System.out.println("find out the location of first space");
        System.out.println( name.indexOf(" "));


    }
}
