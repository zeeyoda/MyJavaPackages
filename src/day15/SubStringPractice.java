package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        //              0123456789012345
        String movie = "Lord of the Ring";
        // Sub String will return part of another String
        //starting from beginning index until right before ending index

        String wordOf = movie.substring(5, 7);
        System.out.println("wordOf = " + wordOf);
        //I want to get the word (Of) from this movie

        String wordThe = movie.substring(8, 11);
        System.out.println("wordThe = " + wordThe);

        //get from the second word till last word
        //                0123456789012345
       // String movie = "Lord of the Ring";
       //find out first space index/
       //second word start right after first space so that's out starting point
       //my ending point is one more than our last index
        //int startingPoint = movie.indexOf(" ") + 1;
        //int endingPoint = movie.length();
        //System.out.println("second word till last: " + movie.substring(startingPoint,endingPoint));

        //assume we know the starting point of 2nd word and ending of the sentence
        String secondWordTillLast = movie.substring(5, 16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);
        
        String wordOfLord = movie.substring(0,7);
        System.out.println("wordOfLord = " + wordOfLord);;

        //if you want to get from a point till the end of the string above method will work
        //However, there is even a better method, if you provide only one parameter to substring method
        // it will start from that location and get till the end
        String secondToLast = movie.substring(5);
        System.out.println(secondToLast);

        //Task -- reverse Lord of the Ring to Ring of the Lord
        String lastWord = movie.substring(12, 16);
        String secondWord = movie.substring(4, 12);
        String firstWord = movie.substring(0,5);
        System.out.println(lastWord + secondWord + firstWord);

        //Turn -->> Lord of the Ring -->> Ring of the Java Lord
        System.out.println(firstWord + secondToLast + " Java " + lastWord);

    }
}
