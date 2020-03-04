package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {


        //get the 2nd Java from the sentence
        //assume you already know there is 4 Java in this sentence
        //second java means -->> the Java showed up after 1st Java

        //first find out where is location of the first Java showed up
        //in order to find the second one,
        //instead of searching from the beginning,
        //search from right after the location you found first Java
        //then it will give you the index of second Java

        //BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        //BECAUSE INDEX OF ALWAYS START FROM BEGINNING

        //indexOfMethod has 2 versions: 1 is expect external data, another is expect 2 external data
        //             012345678901234567890123456789012
        String name = "I love Java I love Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println("Java starting from 7 " + name.indexOf("Java", 7));
        System.out.println("Java starting from 8 " + name.indexOf("Java", 8));
        System.out.println("Java starting from  9" +name.indexOf("Java", 9));
        System.out.println("Java starting from 19" + name.indexOf("Java", 19));
        System.out.println("Java starting from 20" + name.indexOf("Java", 20));

        int firstJavaLocation = name.indexOf("Java"); //location of first Java, in this case 7
        int startingPointToSearchSecondJava = firstJavaLocation + 1 ;
        // starting point can be right after the index of first character of the word
        // or you can start here + 4
        //or you can start right after you finish the word you are searching, for the word java + 4
        //if we do not know the length of the word -->> +word.length()

        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation+1);
        System.out.println("Second word in this sentence is " +name.substring(firstSpaceLocation+1, secondSpace));

                


    }
}
