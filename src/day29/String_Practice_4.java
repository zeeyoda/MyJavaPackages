package day29;

import java.util.Arrays;

public class String_Practice_4 {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        //Task:
        // Hero code is Superman and Identity is Clark Kent
        //The initial of the Hero is CK

        //Logic 1: split this by dash -
        // to get 2 pieces of string into a string array

        String[] heroSplit = hero1.split("-");
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];

        System.out.println("heroSplit = "+ Arrays.toString(heroSplit));
        //Hero code is Superman and Identity is Clark Kent
        System.out.println("Hero code is " + heroSplit[0]+" and Identity is" + heroSplit);

        //Get the initials of the Hero Clark Kent
        //I can just use fullName variable to finish this task

        //LOGIC 1:
        // get the first letter/character of fullName and get first letter after space and concatenate them
        // if person has middle name as well then solution instead of looking for the first space
        // look for the lastIndex of space then get next Character.

        //LOGIC 2:
        // we already have fullName stored in fullName variable
        //split by space -->> we will get firstName (middle name) lasName
        //get the first letter of full name
        //then get the last name using last item index
        //get the first character then concatenate
        //Clark Kent -->> [ Clark, Kent] Clark->C Kent-K-->K

        String[] fullNameSplit = fullName.split(" ");
        System.out.println("fullNameSplit = "+ Arrays.toString(fullNameSplit));
        //last name will always be the last element of split full name regardless whether there is a middle name or not

        String lastName = fullNameSplit[fullNameSplit.length-1];
        System.out.println("lastName = "+ lastName);
        System.out.println("Initial of the hero is: "+fullName.charAt(0)+lastName.charAt(0));




    }

}
